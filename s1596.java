public class ExampleClass {
    private List<String> collection1 = Collections.EMPTY_LIST;  // Noncompliant
    private Map<String, String> collection2 = Collections.EMPTY_MAP;  // Noncompliant
    private Set<String> collection3 = Collections.EMPTY_SET;  // Noncompliant

    public ExampleClass() {
        List<String> newColletion = Collections.EMPTY_LIST; // Noncompliant
    }
}
