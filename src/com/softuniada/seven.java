package com.softuniada;

import java.util.*;

public class seven {
    private static int count = 0;
    private static void permute(List<Integer> list, int index, Map<Integer, Integer> pairs) {
        for (int i = index; i < list.size(); i++) {
            Collections.swap(list, i, index);
            permute(list, index + 1, pairs);
            Collections.swap(list, index, i);
        }
        if (index == list.size() - 1) {
            if(valid(list, pairs)) {
                count++;
            }
        }
    }

    public static boolean valid(List<Integer> a, Map<Integer, Integer> pairs) {
        for(Map.Entry<Integer,Integer> entry : pairs.entrySet()) {
            int s = entry.getKey();
            int e = entry.getValue();
            int sI = a.indexOf(s);
            int eI = a.indexOf(e);
            if(sI > eI) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i=1;i<=n;i++) {
            arr.add(i);
        }
        scanner.nextLine();
        Map<Integer, Integer> pairs = new HashMap<>();
        for(int i=0;i<m;i++) {
            String s = scanner.nextLine();
            String r = s.replace("> ", "");
            String[] twoEl = r.split(" ");
            pairs.put(Integer.valueOf(twoEl[0]), Integer.valueOf(twoEl[1]));
        }
        permute(arr,0, pairs);
        System.out.println(count);
    }
}
