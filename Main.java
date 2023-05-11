import pengguna.*;

class Main {
    public static void main(String[] args) {
        Mhs mhs = new Mhs("ini_username", "ini_password");
        mhs.setNama("Muhammad Maulid Fajar");
        mhs.setNim("G.111.20.0040");
        mhs.setSmt(6);

        System.out.println("Nama     : " + mhs.getNama());
        System.out.println("NIM      : " + mhs.getNim());
        System.out.println("Smt      : " + mhs.getSmt());
        System.out.println("Username : " + mhs.getUsername());
        System.out.println("Password : " + mhs.getPassword());
    }
}