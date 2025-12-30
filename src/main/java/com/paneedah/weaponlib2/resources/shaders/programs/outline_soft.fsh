#version 120

uniform sampler2D DiffuseSampler;

varying vec2 texCoord;
varying vec2 oneTexel;

uniform float LumaRamp;
uniform float LumaLevel;
uniform float FlashEnabled;
uniform float ThermalVisionEnabled;
uniform float VignetteEnabled;
uniform float VignetteRadius;
uniform sampler2D DiffuseSampler;
uniform sampler2D NoiseSampler;
uniform sampler2D GogglesOverlaySampler;
uniform float NoiseAmplification;
uniform float Time;

void main(){
    vec4 center = texture2D(DiffuseSampler, texCoord);

    if(FlashEnabled > 0) {
        const vec3 white = vec3(1.0, 1.0, 1.0);
        float clampedBrightness = clamp(Brightness / 100, 0.0, 1.0);
        float whiteBalance = 1.0 - clampedBrightness;
        texColor.rgb = mix(white * 3, texColor.rgb * Brightness, whiteBalance);
    } else {
        texColor.rgb *= Brightness;
    }
    
    if(ThermalVisionEnabled > 0) {
        vec2 uv;
        uv.x = 0.35 * sin(Time * 10);
        uv.y = 0.35 * cos(Time * 10);
        vec3 noise = texture2D(NoiseSampler, texCoord.xy + uv).rgb * NoiseAmplification;
        texColor.xy += noise.xy * 0.005;
    }

    if(VignetteEnabled > 0) {
        float dist = distance(texCoord.xy, vec2(0.5,0.5));
        float vignette = smoothstep(VignetteRadius, VignetteRadius - SOFTNESS, dist);
        texColor.rgb *= vignette;
        texColor.a = 1.0;
    }

    if(ThermalVisionEnabled > 0) {
    vec4 up     = texture2D(DiffuseSampler, texCoord + vec2(        0.0, -oneTexel.y));
    vec4 up2    = texture2D(DiffuseSampler, texCoord + vec2(        0.0, -oneTexel.y) * 2.0);
    vec4 down   = texture2D(DiffuseSampler, texCoord + vec2( oneTexel.x,         0.0));
    vec4 down2  = texture2D(DiffuseSampler, texCoord + vec2( oneTexel.x,         0.0) * 2.0);
    vec4 left   = texture2D(DiffuseSampler, texCoord + vec2(-oneTexel.x,         0.0));
    vec4 left2  = texture2D(DiffuseSampler, texCoord + vec2(-oneTexel.x,         0.0) * 2.0);
    vec4 right  = texture2D(DiffuseSampler, texCoord + vec2(        0.0,  oneTexel.y));
    vec4 right2 = texture2D(DiffuseSampler, texCoord + vec2(        0.0,  oneTexel.y) * 2.0);
    vec4 uDiff = abs(center - up);
    vec4 dDiff = abs(center - down);
    vec4 lDiff = abs(center - left);
    vec4 rDiff = abs(center - right);
    vec4 u2Diff = abs(center - up2);
    vec4 d2Diff = abs(center - down2);
    vec4 l2Diff = abs(center - left2);
    vec4 r2Diff = abs(center - right2);
    vec4 sum = uDiff + dDiff + lDiff + rDiff + u2Diff + d2Diff + l2Diff + r2Diff;
    vec4 gray = vec4(0.3, 0.59, 0.11, 0.0);
    float sumLuma = 1.0 - dot(clamp(sum, 0.0, 1.0), gray);
    
    // Get luminance of center pixel and adjust
    float centerLuma = dot(center + (center - pow(center, vec4(LumaRamp))), gray);
    
    // Quantize the luma value
    centerLuma = centerLuma - fract(centerLuma * LumaLevel) / LumaLevel;
    
    // Re-scale to full range
    centerLuma = centerLuma * (LumaLevel / (LumaLevel - 1.0));
    
    // Blend with outline
    centerLuma = centerLuma * sumLuma;
    }
    
    gl_FragColor = vec4(centerLuma, centerLuma, centerLuma, center.a);
}
