package design_patterns.structural.composite;

public class File implements FileSystemComponent{
    private String name;

    public File(String name){
        this.name = name;
    }

    @Override
    public void displayDetails() {
        System.out.println("File : " + name);
    }
}
