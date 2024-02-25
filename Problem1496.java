import java.util.*;

public class Problem1496 {

    public boolean isPathCrossing(String path) {
        
        List<List<Integer>> locations = new ArrayList<>();

        int[] currentLocation = {0, 0};
        locations.add(new ArrayList<>(Arrays.asList(currentLocation[0], currentLocation[1])));

        for (int i = 0; i < path.length(); i++) {

            char direction = path.charAt(i);

            if (direction == 'N') currentLocation[1]++;
            else if (direction == 'S') currentLocation[1]--;
            else if (direction == 'E') currentLocation[0]++;
            else if (direction == 'W') currentLocation[0]--;
            
            for (List<Integer> cord : locations) {

                if (cord.get(0) == currentLocation[0] 
                        && cord.get(1) == currentLocation[1]) {

                    return true;
                }
            }

            locations.add(new ArrayList<>(Arrays.asList(currentLocation[0], currentLocation[1])));
        }

        return false;
    }
}
