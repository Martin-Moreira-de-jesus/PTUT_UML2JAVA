package fr.uml2java;

import java.util.ArrayList;

public class UMLClass extends UMLObject {
    private boolean isAbstract = false;
    private ArrayList<UMLAttribute> attributes;
    private ArrayList<UMLOperation> operations;
    private ArrayList<UMLAssociation> associations;

    public UMLClass() {
        super();
        attributes = new ArrayList<>();
        operations = new ArrayList<>();
        associations = new ArrayList<>();
    }

    @Override
    public String toString() {
        String s = super.toString();
        s = s.substring(0, s.length() - 2) + ((isAbstract) ? " isAbstract;" : "") + " contains :\n";
        s += "\tattributes : \n";
        for (UMLAttribute umlAttribute : attributes) {
            s += "\t\t" + umlAttribute.toString();
        }
        s += "\toprations : \n";
        for (UMLOperation umlOperation : operations) {
            s += "\t\t" + umlOperation.toString();
        }
        s += "\towned elements : \n";
        for (UMLAssociation umlAssociation : associations) {
            s += "\t\t" + umlAssociation.toString();
        }
        return s;
    }

    public ArrayList<UMLAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(ArrayList<UMLAttribute> attributes) {
        this.attributes = attributes;
    }

    public ArrayList<UMLOperation> getOperations() {
        return operations;
    }

    public void setOperations(ArrayList<UMLOperation> operations) {
        this.operations = operations;
    }

    public ArrayList<UMLAssociation> getAssociations() {
        return associations;
    }

    public void setAssociations(ArrayList<UMLAssociation> associations) {
        this.associations = associations;
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

    public void addAttribute(UMLAttribute umlAttribute) {
        attributes.add(umlAttribute);
    }

    public void addOperation(UMLOperation umlOperation) {
        operations.add(umlOperation);
    }

    public void addAssociation(UMLAssociation umlAssociation) {
        associations.add(umlAssociation);
    }

    public UMLAttribute getLastAtt() {
        return attributes.get(attributes.size() - 1);
    }

    public boolean isAbstract() {
        return isAbstract;
    }

    public void setAbstract() {
        isAbstract = true;
    }
}
