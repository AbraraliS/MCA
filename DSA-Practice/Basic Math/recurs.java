class recurs {
//infinite
    static int cnt = 0;
    static void m(){
        if (cnt<=5) {
            System.out.println(cnt);
            ++cnt;
            m();
        }
    }
    
    public static void main(String[] args) {
        m();
        
    }
}