package ru.job4j.oop;

public class Jukebox {
    public  void music(int position) {
        String lyric = switch (position) {
            case 1 -> "Пусть бегут неуклюже пешеходы по лужам, а вода по асфальту рекой...";
            case 2 -> "Спят усталые игрушки, книжки спят, одеяла и подушки ждут ребят...";
            default -> "Песня не найдена";
        };
        System.out.println(lyric);
    }

    public static void main(String[] args) {
        Jukebox box = new Jukebox();
        box.music(2);
    }
}
