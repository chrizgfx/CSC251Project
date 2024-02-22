public class Policy {
    private static int policyCount = 0;
    private String policyNumber;
    private String providerName;
    private PolicyHolder policyHolder;

    public Policy(String policyNumber, String providerName, PolicyHolder policyHolder) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolder = policyHolder;
        policyCount++;
    }

    /**
     * @return number of policies created
     */
    public static int getPolicyCount() {
        return policyCount;
    }

    /**
     * @return policy holder
     */
    public PolicyHolder getPolicyHolder() {
        return policyHolder;
    }

    /**
     * @return policy number and provider name
     */
    public String toString() {
        return "Policy Number: " + policyNumber + "\n" +
               "Provider Name: " + providerName + "\n" +
               policyHolder.toString();
    }
}
