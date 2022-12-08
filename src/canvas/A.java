package canvas;

import java.util.StringJoiner;

class A {
    public String[] getSdlc() {
        return sdlc;
    }

    String sdlc[] = {
            "requirement analysis",
            "design",
            "development",
            "testing",
            "implementation",
            "maintenance"
    };
    
    public static void main(String args[]) {
        B obj = new C();
        for (int i = 0; i < obj.getSdlc().length;
             i++) {
            System.out.print(obj.getSdlc()[i] + "");
        }
    }
}
class B extends A {
    public String[] getSdlc() {
        return sdlc;
    }

    private String sdlc[] = {
            "r","d","d","t","i","m"
    };
}
class C extends B {
    public String[] getSdlc() {
        return sdlc;
    }

    String sdlc[] = {
             "s","d","l","c"
    };
}

    


