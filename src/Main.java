import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, newpassword;
        int control;

        Scanner inp = new Scanner(System.in);
        System.out.println("Kullanıcı Adınızı Giriniz : ");
        userName = inp.nextLine();
        System.out.println("Şifrenizi Giriniz : ");
        password = inp.nextLine();
        if (userName.equals("patika") && password.equals("java1234")) {
            System.out.println("Giriş Başarılı");

        } else {
            System.out.println("Girdiğiniz Şifre Yanlış! Yeni Şifre Belirlemek İster misiniz? EVET ise 1'e Hayır ise 2'ye basın");
            control = inp.nextInt();

            if (control == 1){
                System.out.println("Yeni Şifre Oluşturunuz : ");

                newpassword = inp.next();


                if (newpassword.equals("java1234")){
                        System.out.println("Yeni Şifreniz Eski Şifreniz ile Aynı Olamaz!");
                    }else {
                        System.out.println("Yeni Şifreniz Oluşturuldu : " + newpassword);
                    }


            } else if (control == 2) {
                System.out.println("Oturum Açılamadı.");
                
            }

        }
        }


    }
