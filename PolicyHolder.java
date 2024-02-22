public class PolicyHolder {
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    public PolicyHolder(String firstName, String lastName, int age, String smokingStatus, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    // getters

    /**
     * @return first name of the policyholder
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return last name of the policyholder
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * @return age of the policyholder
     */
    public int getAge() {
        return age;
    }

    /**
     * @return smoking status of policyholder ("smoker" or "non-smoker")
     */
    public String getSmokingStatus() {
        return smokingStatus;
    }

    /**
     * @return height of the policyholder
     */
    public double getHeight() {
        return height;
    }

    /**
     * @return weight of the policyholder
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @return BMI of the policyholder
     */
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }

    /**
     * @return price of the insurance policy
     */
    public double calculatePolicyPrice() {
        double bmi = calculateBMI();
        double additionalFee = (bmi - 35) * 20;
        double baseFee = 600;

        if (age > 50) {
            additionalFee += 75;
        }

        if (smokingStatus.equalsIgnoreCase("smoker")) {
            additionalFee += 100;
        }

        return baseFee + additionalFee;
    }

    /**
    * @return policyholder string
    */
    public String toString() {
        return "Policyholder's First Name: " + firstName + "\n" +
               "Policyholder's Last Name: " + lastName + "\n" +
               "Policyholder's Age: " + age + "\n" +
               "Policyholder's Smoking Status (Y/N): " + smokingStatus + "\n" +
               "Policyholder's Height: " + height + " inches\n" +
               "Policyholder's Weight: " + weight + " pounds\n" +
               "Policyholder's BMI: " + String.format("%.2f", calculateBMI()) + "\n" +
               "Policy Price: $" + String.format("%.2f", calculatePolicyPrice()) + "\n";
    }
}
