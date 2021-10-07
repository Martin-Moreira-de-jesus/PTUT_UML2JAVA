package fr.uml2java;

enum Visibility {
    PRIVATE,
    PUBLIC,
    PROTECTED
}

public class UMLAssociationEnd extends UMLObject {
    private Visibility visibility;
    private String multiplicity;

    public Visibility getVisibility() {
        return visibility;
    }

    public String getMultiplicity() {
        return multiplicity;
    }

    public String getName() {
        return super.getName();
    }

    public String getId() {
        return super.getId();
    }

    public String getReference() {
        return super.getReference();
    }

    public String getParent() {
        return super.getParent();
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public void setMultiplicity(String multiplicity) {
        this.multiplicity = multiplicity;
    }

    public void setName(String name) {
        super.setName(name);
    }

    public void setId(String id) {
        super.setId(id);
    }

    public void setReference(String reference) {
        super.setReference(reference);
    }

    public void setParent(String parent) {
        super.setParent(parent);
    }
}