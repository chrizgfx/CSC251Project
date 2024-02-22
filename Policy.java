class Policy {
    private String policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    // getters

    /**
     * @return policy number of the policyholder
     */
    public String getPolicyNumber() {
        return policyNumber;
    }

    /**
     * @return provider name of the policyholder
     */
    public String getProviderName() {
        return providerName;
    }

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
     * @return height of policyholder
     */
    public double getHeight() {
        return height;
    }

    /**
     * @return The weight of the policyholder
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param policyNumber (policy number)
     * @param providerName (name of the insurance provider)
     * @param firstName (first name of the policyholder)
     * @param lastName (last name of the policyholder)
     * @param age (age of the policyholder)
     * @param smokingStatus ("smoker" or "non-smoker")
     * @param height (height of the policyholder in inches)
     * @param weight (weight of the policyholder in pounds)
     */

    public Policy() {
        this.policyNumber = "";
        this.providerName = "";
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.smokingStatus = "";
        this.height = 0.0;
        this.weight = 0.0;
    }

    public Policy(String policyNumber, String providerName, String firstName, String lastName,
                  int age, String smokingStatus, double height, double weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
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
}
