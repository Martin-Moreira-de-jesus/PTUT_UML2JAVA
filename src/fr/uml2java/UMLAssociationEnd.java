package fr.uml2java;

public class UMLAssociationEnd extends UMLObject {
    private String visibility = "public";
    private String multiplicity;
    private String reference;

    @Override
    public String toString() {
        String s = super.toString();
        s = s.substring(0, s.length() - 2);
        return s + " with visibility : "
                + visibility + "; with multiplicity : " + multiplicity
                + "; pointing to class with id : " + reference + '\n';
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getMultiplicity() {
        return multiplicity;
    }

    public void setMultiplicity(String multiplicity) {
        this.multiplicity = multiplicity;
    }

    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        super.setName(name);
    }

    public String getId() {
        return super.getId();
    }

    public void setId(String id) {
        super.setId(id);
    }

    public String getParent() {
        return super.getParent();
    }

    public void setParent(String parent) {
        super.setParent(parent);
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
