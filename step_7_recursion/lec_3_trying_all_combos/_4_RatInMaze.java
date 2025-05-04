package step_7_recursion.lec_3_trying_all_combos;

import java.util.ArrayList;
import java.util.List;

public class _4_RatInMaze {

    private static void traverse(ArrayList<ArrayList<Integer>> mat, ArrayList<String> result, String path, int i, int j) {
        if (i == mat.size() - 1 && j == mat.get(0).size() - 1) {
            result.add(path);
            return;
        }

        mat.get(i).set(j, -1);

        // down
        if (i + 1 < mat.size() && mat.get(i + 1).get(j) == 1) {
            traverse(mat, result, path + "D", i + 1, j);
        }

        // right
        if (j + 1 < mat.get(0).size() && mat.get(i).get(j + 1) == 1) {
            traverse(mat, result, path + "R", i, j + 1);
        }

        // up
        if (i - 1 >= 0 && mat.get(i - 1).get(j) == 1) {
            traverse(mat, result, path + "U", i - 1, j);
        }

        // left
        if (j - 1 >= 0 && mat.get(i).get(j - 1) == 1) {
            traverse(mat, result, path + "L", i, j - 1);
        }

        mat.get(i).set(j, 1); // backtrack
    }

    public static ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
        ArrayList<String> result = new ArrayList<>();
        if (mat.get(0).get(0) == 1) {
            traverse(mat, result, "", 0, 0);
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();

        mat.add(new ArrayList<>(List.of(1, 0, 0, 0)));
        mat.add(new ArrayList<>(List.of(1, 1, 0, 1)));
        mat.add(new ArrayList<>(List.of(1, 1, 0, 0)));
        mat.add(new ArrayList<>(List.of(0, 1, 1, 1)));

        ArrayList<String> paths = findPath(mat);
        System.out.println("All possible paths from top-left to bottom-right:");
        for (String path : paths) {
            System.out.println(path);
        }
    }
}
