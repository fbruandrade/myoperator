package dev.fandrade.myoperator;

public class ServiceSpec extends io.fabric8.kubernetes.api.model.ServiceSpec {
    private String name;
    private String label;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
