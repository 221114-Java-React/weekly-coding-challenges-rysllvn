package com.revature.problem2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<String> autoComplete(List<String> list) {
        String queryString = list.get(0);

        List<String> answer = new ArrayList<>();

        for (int i = 1; i < list.size(); i++) {
            String curr = list.get(i);
            if (curr.startsWith(queryString)) {
                answer.add(curr);
            }
        }
        Collections.sort(answer);
        return answer;
    }
}
