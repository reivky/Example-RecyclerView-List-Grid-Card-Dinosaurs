package com.reivart.dinosaurus;

import java.util.ArrayList;

public class DinoData {
    private static String[] dinoNames = {
            "Ankylosaurus",
            "Brachiosaurus",
            "Compsognathus",
            "Liopleurodon",
            "Parasaurolophus",
            "Pterodactyl",
            "Spinosaurus",
            "Stegosaurus",
            "Tyrannosaurus Rex",
            "Triceratops"
    };

    private static String[] dinoDetails = {
            "Panjang tubuh hewan purbakala ini bisa mencapai 9 meter atau 30 kaki. Tubuhnya Ankylosaurus dibalut dengan sejenis cangkang keras yang membuat tubuhnya tak mudah diserang bahkan oleh T-Rex sekalipun. Jika ia diserang oleh lawannya, maka ia akan mempertahankan dirinya dengan menyerang menggunakan ekornya yang panjang dan lurus dan ujungnya yang keras berbentuk seperti sebuah gada.",
            "Termasuk dalam genus sauropod dan ditemukan pertama kali di Grand River Canyon (sekarang adalah Sungai Colorado), Amerika Serikat. Seperti sauropoda yang lain, ia merupakan binatang berkaki empat dengan tengkorak kepala kecil, dengan leher dan ekor yang panjang, berotot, dan ramping. Diperkirakan tubuhnya bisa mencapai panjang 26 meter dengan berat badan hingga 70-80 ton.",
            "Salah satu jenis dinosaurus kecil yang menyerang mangsanya secara berkelompok layaknya velociraptor namun dengan jumlah yang lebih besar. Konon, strategi kelompok compsognathus lebih agresif dibanding velociraptor yang mana mereka tak perlu pengalih perhatian, namun bantuan tambahan yang siap siaga di belakang. Untuk ukuran tubuh, compsognathus bisa dikatakan sebagai yang paling kecil dengan panjang 60 cm, hanya sebesar seekor ayam. Hidup di zaman Jurassic akhir hingga awal Kretasius.",
            "Merupakan reptil raksasa penghuni lautan yang hidup di periode Jurassic. Panjang tubuh 25 meter dengan 4 buah sirip sepanjang 3 meter lebih. Tengkorak dinosaurus ini saja berukuran 5 meter dengan susunan gigi yang tajam. Tak heran jika ia dikelompokkan sebagai karnivora air terganas dan terkuat yang pernah hidup.",
            "Jenis dinosaurus ini dianggap sebagai salah satu dinosaurus tertua dan juga dianggap sebagai binatang semi akuatik. Jika ia diserang, parasaurolophus akan lari menuju ke air.",
            "Kata pterodactyl merupakan sebutan untuk reptil bersayap yang disebut juga pterosaurus. Menurut para ahli, terdapat 30 generasi pterosaurus yang pernah hidup di bumi. Fosil pterosaurus pertama ditemukan ialah Pterodactylus di tahun 1784 oleh Cosimo Collini, ilmuwan asal Italia. Awalnya ia mengira menemukan hewan laut yang memakai sayapnya untuk mendayung.",
            "Merupakan karnivora raksasa dengan serangkaian duri di atas punggungnya. Hidup di zaman Kretasius akhir sekitar 98-95 juta tahun lalu di tempat yang sekarang adalah Afrika. Panjang tubuh jenis dinosaurus ini mencapai 15 meter dengan berat 4 ton. Disebut juga sebagai ‘kadal berduri’ karena ia memiliki duri bersaraf besar sampai 1,8 meter yang muncul dari tulang punggungnya.",
            "Termasuk jenis dinosaurus yang mudah dikenali karena adanya dua sisik yang saling menyilang di punggungnya. Sebab itulah itu diberi nama Stegosaurus yang bermakna ‘kadal beratap’.",
            "Sering disingkat menjadi T-Rex yang bermakna kadal yang kejam. Panjang tubuhnya mencapai 12 meter/40 kaki dengan berat badan 7 ton. Mangsanya ialah dinosaurus herbivora seperti triceratops dan edmontosaurus.",
            "Nama dinosaurus ini berasal dari bahasa Yunani yang bermakna tiga tanduk, sering disingkat menjadi Tritop. Dinosaurus ini jarang melarikan diri dari T-Rex karena ia bisa melindungi dirinya dengan tandukan yang tajam dengan kombinasi tandung layaknya pedang dan kepala yang seperti tameng."
    };

    private static int[] dinoImages = {
            R.drawable.ankylosaurus,
            R.drawable.brachiosaurus,
            R.drawable.compsognathus,
            R.drawable.liopleurodon,
            R.drawable.parasaurolophus,
            R.drawable.pterodactyl,
            R.drawable.spinosaurus,
            R.drawable.stegosaurus,
            R.drawable.trex,
            R.drawable.triceratops
    };

    static ArrayList<Dino> getListData() {
        ArrayList<Dino> list = new ArrayList<>();
        for (int position = 0; position < dinoNames.length; position++) {
            Dino dino = new Dino();
            dino.setName(dinoNames[position]);
            dino.setDetail(dinoDetails[position]);
            dino.setPhoto(dinoImages[position]);
            list.add(dino);
        }
        return list;
    }
}

