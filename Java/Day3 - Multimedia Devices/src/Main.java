import com.example.manufacturecompany.BasicMediaPlayer;
import com.example.manufacturecompany.HomeTheaterSystem;
import com.example.manufacturecompany.SmartTv;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BasicMediaPlayer basicMediaPlayer = new BasicMediaPlayer("Sony", "XYZ-100", 2022, new String[]{"MP3", "AVI"});
        SmartTv smartTv = new SmartTv("LG", "AB-200", 2023, 55, new String[]{"YouTube", "Netflix"});
        HomeTheaterSystem homeTheater = new HomeTheaterSystem("LG", "HTS-8000", 2024, 80, new String[]{"Netflix", "Disney+", "Amazon prime"});

        while (true) {
            System.out.println();
            System.out.println("Choose a device");
            System.out.println("1. Basic Media Player");
            System.out.println("2. Smart TV");
            System.out.println("3. Home Theater System");
            System.out.println("0. Exit");
            System.out.println();
            System.out.print("Enter the your choice : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    basicMediaPlayer.displayInfo();
                    basicMediaPlayer.play();
                    break;
                case 2:
                    smartTv.displayInfo();
                    smartTv.adjustVolume();
                    smartTv.changeChannel();
                    break;
                case 3:
                    homeTheater.displayInfo();
                    homeTheater.adjustVolume();
                    homeTheater.changeChannel();
                    homeTheater.adjustBass();
                    homeTheater.adjustTreble();
                    break;
                case 0:
                    System.out.println("Exit");
                    scanner.close();
                    return;
                default:
                    System.out.println("Enter the valid option");
            }
        }
    }
}