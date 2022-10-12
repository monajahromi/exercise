package com.mapsa.exercise.AlirezaJamshidi.seriesc.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberedCards {
    public static boolean winRound(int[] you, int[] opponent) {
        int maxYou = get2Max(you);
        int maxOpponent = get2Max(opponent);
        return maxYou > maxOpponent;
    }

    private static int get2Max(int[] array) {
        if (array.length == 0) {
            return -100;
        } else if (array.length == 1) {
            return array[0];
        } else {
            List<Integer> list = new ArrayList<>();
            for (int i : array) {
                list.add(i);
            }
            int max1 = Collections.max(list);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == max1) {
                    list.remove(list.get(i));
                    break;
                }
            }
            int max2 = Collections.max(list);
            return (max1 * 10) + max2;
        }
    }
}
