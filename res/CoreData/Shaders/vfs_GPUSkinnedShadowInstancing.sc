�GSN    �˅1��\7,5V'pcw2toT��6�6e�$<غ�$^h����t�&�N��b�p<�N%�?zw/$צ�	}�tX���;��;gT�L�ײ��:ҋ��ec�T�Rr�:�!���Jn��Z<�vo�j�=�Ff�����~�&��$������f����xOð�~��Lt�B�׺�u!,��Ap/�,?́�꣰�^Ŝ)��+��tnj�ɒ�����O� ZXs�ƻϯ_u����r�2l.PJ������b��}�=t�sBD�R�����<m��e�n���n{���{���i��BHk��O�hjU�2#+��Q����pg�%����&�~U�ϻqTh%���B�m�S����1�0*�C����P����`MeT��-�6b�0r�[����F��T��9�MF�Bƒ}��KR)R��H�����=���.aP��<�~y�H� ��ӆ�͡��ɖ>�B*��ϚvRv.�tK�i)T�
�(9qO(�Խ��F?u_cascadedViewport[1];
   float t2 = u_cascadedViewport[2];
   float t3 = u_cascadedViewport[3];

   u =  t0 + (t2 - t0) * �;
   v =  t1 + (t3 - t1) * v;

   gl_Position.x = u * 2.0 - 1.0;
   gl_Position.y = v * 2.0 - 1.0;
}

#endif


/// Fr2g shader
#ifdef FS

#include "Library/Common.glsl"

void main()
{
    gl_FragColor = vec4_splat(0.0);
}

#endif
