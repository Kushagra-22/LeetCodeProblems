import java.util.HashMap;

public class frogJumpForm2 {

    public static boolean canCross(int[] stones) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : stones) {
            map.put(i, 1);
        }
        helper(stones, 1, 1, 1, map);
        return false;
    }

    public static boolean helper(int[] stones, int index, int currentStone, int currentStep,
            HashMap<Integer, Integer> map) {
        if (index == stones.length - 1) {
            return true;
        }
        System.out.println("Current step " + currentStep);
        int first = currentStep - 1;
        int second = currentStep;
        int third = currentStep + 1;
        System.out.println("First " + first + " Second " + second + " Third " + third);
        System.out.println("Current stone " + currentStone);

        if (map.containsKey(first + currentStone)) {
            currentStep = first;
            currentStone += currentStep;
        } else if (map.containsKey(second + currentStone)) {
            currentStep = second;
            currentStone += currentStep;
        } else if (map.containsKey(third + currentStone)) {
            currentStep = third;
            // currentStep = Math.max(first, Math.max(second, third));
            currentStone += currentStep;
        }
        helper(stones, index + 1, currentStone, currentStep, map);

        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 3, 5, 6, 8, 12, 17, };
        System.out.println(canCross(arr));

    }
}
