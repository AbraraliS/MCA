package Interface;

interface Interface1 {

    void SRN(String srn);
    void myName(String name);
    void myResult(float[] result);
} 

class InterfaceClass implements Interface1 {

    @Override
    public void SRN(String srn) {
        System.out.println(srn);
    }

    @Override
    public void myName(String name) {
        System.out.println(name);
   
    }

    @Override
    public void myResult(float[] result) {
        float avg = 0;
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
            avg += result[i];
        }
        avg /= result.length;
        System.out.println(avg);
  
    }
    
}