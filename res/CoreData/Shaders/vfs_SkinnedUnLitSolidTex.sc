�GSN    �˅1��\7,5V'pcw2toT��6�6e�$<غ�$^h����t�&�N��b�p<�N%�5py|pj���Rv��!B1��!�u�'aQ����ؕpՀ��$HH�zK�yN��IC���QK�W�7K"�	�U�%�ZJ��Ǌ�k�
3��cW������a����f���7��?-S�-��O#��,E�Hoϋ����#��c����I_ �ڈ�����Q%�"s9rBǼᐨ�Bn����t�{Dqf������(m��/��7U�Add�`��į�q0ֵ�)Ѿ�u7��ϧ}�_�U�(f��^Bi��o�8-�Ae�F�����$&�%����{O�-M�r��75g����m�1�Ͳ�$�6o�}��x����.)	��R�i�8o�Z�B���ޱKǭ�{A���;��QZv.۶%��u�QϘ:���3$R��n�S#Zd������z�ź[����r���P5C�����?"7�eS�=O�L�j@>oYf䕪��TQormalFinal.glsl"
     #include "Library/Macro/Texcoord0Final.glsl"
     #include "Library/Macro/ShadowCoordFinal.glsl"
     �include "Library/Macro/FragPosFinal.glsl"

}
#endif

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USING_INOT_TEXCOORD0
#define USING_INOUT_SHADOWCOORD
#define USING_INOUT_FRAGPOS
#include "Library/Varying.glsl"

/// Common (unifo�ms,samplers, transforms ... )
//#define RECEIVED_SHADOW
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

vid main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    gl_FragColor = vec4(texColor.rgb,1.0);
}

#endifc
