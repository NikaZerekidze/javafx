package ge.edu.btu;

class Types {
    public Boolean type;

    void printType(int x) {
        type=true;
        System.out.println(x + " is an int" + type);
    }

    void printType(float x) {
        type=true;
        System.out.println(x + " is an float" + type);
    }

    void printType(double x) {
        type=true;
        System.out.println(x + " is an double" + type);
    }

    void printType(char x) {
        type=false;
        System.out.println(x + " is an char" + type);
    }
}
