package fr.uml2java;

public class UMLAttribute extends UMLObject {
    private String type;
    private boolean initialized = false;
    private boolean list = false;
    private boolean notEmpty = false;

    public UMLAttribute() {
        super();
    }

    @Override
    public String toString() {
        String s = super.toString();
        s = s.substring(0, s.length() - 2);
        return s + " type : " + type + ((list) ? "; is a list" : "") + ((notEmpty) ? "is not empty" : "" ) +
                ((initialized) ? "is initialized" : "") +'\n';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public boolean isInitialized() {
        return initialized;
    }

    public void setInitialized() {
        this.initialized = true;
    }

    public boolean isList() {
        return list;
    }

    public void setList() {
        this.list = true;
    }

    public boolean isNotEmpty() {
        return notEmpty;
    }

    public void setNotEmpty() {
        this.notEmpty = true;
    }
}
