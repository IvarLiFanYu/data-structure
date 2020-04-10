package com.company.tree;

/**
 * 暴力破解
 * 时间复杂度 : 时间复杂度为O(slen*plen)
 */
public class BruteForce {

    /**
     *从第 0 个元素开始比较
     * @param s 主串
     * @param slen 主串长度
     * @param p 子串
     * @param plen 子串长度
     * @return 匹配成功后第一个匹配成功的字符在[主串]中的位置[从 0 开始]
     */
    public static int findIndex1(char[] s, int slen, char[] p, int plen) {

        int i = 0;
        int j = 0;

        if (slen < plen) {
            return 0;
        }

        while (i < slen && j < plen) {
            if (s[i] == p[j]) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        if (j >= plen)
            return i - plen + 1;
        return 0;
    }

    /**
     *从第 1 个元素开始比较
     *  @param s 主串
     *  @param slen 主串长度
     *  @param p 子串
     *  @param plen 子串长度
     *  @return 匹配成功后第一个匹配成功的字符在[主串]中的位置[从 0 开始]
     */
    public static int findIndex2(char[] s, int slen, char[] p, int plen) {

        int i = 1;
        int j = 1;

        if (slen < plen) {
            return 0;
        }

        while (i <= slen && j <= plen) {
            if (s[i] == p[j]) {
                i++;
                j++;
            } else {
                i = i - j + 2;
                j = 1;
            }
        }
        if (j >= plen)
            return i - plen;
        return 0;
    }

    public static void main(String[] args) {
        char a1[] = {'a','b','c','d','e','f','g','h'};
        char b1[] = {'d','e','f','g','h'};
        System.out.println(findIndex1(a1,8,b1,5));
        char a2[] = {' ','a','b','c','d','e','f','g','h'};
        char b2[] = {' ','d','e','f','g','h'};
        System.out.println(findIndex2(a2,8,b2,5));
    }


}
