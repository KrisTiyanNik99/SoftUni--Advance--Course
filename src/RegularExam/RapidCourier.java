package RegularExam;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class RapidCourier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] packages = readLine(scanner);
        int[] couriers = readLine(scanner);

        ArrayDeque<Integer> stackPackages = new ArrayDeque<>();
        IntStream.of(packages)
                .boxed()
                .forEach(stackPackages::push);

        ArrayDeque<Integer> queryCouriers = new ArrayDeque<>();
        IntStream.of(couriers)
                .boxed()
                .forEach(queryCouriers::offer);

        //Predicate<Integer> checkForPositiveNum = integer -> integer <= 0;
        int deliveredWeight = 0;
        while (!stackPackages.isEmpty() && !queryCouriers.isEmpty()) {
            int packagesWeight = stackPackages.pop();
            int courierCapacity = queryCouriers.poll();

            int currentDeliveredWeight;

            if (courierCapacity > packagesWeight) {
                currentDeliveredWeight = packagesWeight;
                //courierCapacity -= (2 * packagesWeight);
                courierCapacity -= packagesWeight;
            } else if (courierCapacity == packagesWeight) {
                currentDeliveredWeight = packagesWeight;
            } else {
                currentDeliveredWeight = courierCapacity;
            }

            deliveredWeight += currentDeliveredWeight;
            courierCapacity -= currentDeliveredWeight;
            packagesWeight -= currentDeliveredWeight;

            if (packagesWeight > 0){
                stackPackages.push(packagesWeight);
            }
            if (courierCapacity > 0) {
                queryCouriers.offer(courierCapacity);
            }
        }

        System.out.printf("Total weight: %d kg\n", deliveredWeight);
        if (stackPackages.isEmpty() && queryCouriers.isEmpty()) {
            System.out.println("Congratulations, all packages were delivered successfully by the couriers today.");
        }
        if (!stackPackages.isEmpty() && queryCouriers.isEmpty()) {
            List<Integer> packs = new ArrayList<>(stackPackages);
            Collections.reverse(packs);
            String formated = returnFormatedString(packs);
            System.out.println("Unfortunately, there are no more available couriers to deliver the following packages: "
                    + formated);
        }
        if (stackPackages.isEmpty() && !queryCouriers.isEmpty()){
            List<Integer> cour = new ArrayList<>(queryCouriers);
            String formated = returnFormatedString(cour);
            System.out.println("Couriers are still on duty: " + formated + " but there are no more packages to deliver.");
        }
    }

    private static String returnFormatedString(List<Integer> packs) {
        return packs.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    private static int[] readLine(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
