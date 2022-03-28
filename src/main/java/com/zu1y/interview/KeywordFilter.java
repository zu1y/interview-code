package com.zu1y.interview;

import com.google.common.collect.Sets;

import java.util.Set;

/**
 * 从给定的文本中，找出是否包含敏感词，并将文本中包含的敏感词替换为*
 * eg:
 * 输入: 出售人民币，代办证
 * 输出：出售***，代**
 */
public class KeywordFilter {
    private Set<String> sensitiveWords = Sets.newHashSet("人民币", "办证"); // 敏感词列表

    public String filter(String content) {

        return content;
    }
}
