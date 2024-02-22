import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Policy> policies = readPoliciesFromFile("PolicyInformation.txt");

        // policies and smoker/nonsmoker count
        System.out.println("There were " + Policy.getPolicyCount() + " Policy objects created.");
        int smokerCount = 0;
        int nonSmokerCount = 0;
        for (Policy policy : policies) {
            System.out.println(policy.toString());
            if (policy.getPolicyHolder().getSmokingStatus().equalsIgnoreCase("smoker")) {
                smokerCount++;
            } else {
                nonSmokerCount++;
            }
        }
        System.out.println("\nThe number of policies with a smoker is: " + smokerCount);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
    }

    private static ArrayList<Policy> readPoliciesFromFile(String filename) {
        ArrayList<Policy> policies = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File(filename));

            while (scanner.hasNext()) {
                String policyNumber = scanner.nextLine();
                String providerName = scanner.nextLine();
                String firstName = scanner.nextLine();
                String lastName = scanner.nextLine();
                int age = scanner.nextInt();
                scanner.nextLine();
                String smokingStatus = scanner.nextLine();
                double height = scanner.nextDouble();
                scanner.nextLine();
                double weight = scanner.nextDouble();
                scanner.nextLine();
                if (scanner.hasNext()) scanner.nextLine();

                // policy and policyholder objects
                PolicyHolder policyHolder = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
                Policy policy = new Policy(policyNumber, providerName, policyHolder);
                policies.add(policy);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        return policies;
    }
}
