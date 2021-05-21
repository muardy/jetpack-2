package com.ardy.jetpackardy.utils

import com.ardy.jetpackardy.R
import com.ardy.jetpackardy.data.MovieEntity
import com.ardy.jetpackardy.data.TvEntity

object DataDummy {

    fun generateDummyCourses(): List<MovieEntity> {

        val courses = ArrayList<MovieEntity>()

        courses.add(MovieEntity("1",
            "A Star Is Born",
            "Musisi berpengalaman Jackson Maine menemukan - dan jatuh cinta - artis Ally yang sedang berjuang. Dia baru saja akan menyerah pada mimpinya untuk menjadi besar sebagai penyanyi - sampai Jack membujuknya menjadi sorotan. Tetapi bahkan saat karier Ally lepas landas, sisi pribadi dari hubungan mereka runtuh, saat Jack bertempur melawan iblis internalnya sendiri.",
            "75",
            "2j 16m",
            "Drama, Romance, Music ",
            "10/05/2018",
            R.drawable.poster_a_start_is_born))
        courses.add(MovieEntity("2",
            "Alita : Battle Angel",
            "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenali, dia dibawa oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat di cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
            "72",
            "2j 2m",
            "Action, Science Fiction, Adventure ",
            "02/14/2019",
            R.drawable.poster_alita))
        courses.add(MovieEntity("3",
            "Aquaman",
            "Dulunya rumah bagi peradaban paling maju di Bumi, Atlantis sekarang menjadi kerajaan bawah air yang diperintah oleh Raja Orm yang haus kekuasaan. Dengan pasukan besar yang dimilikinya, Orm berencana untuk menaklukkan orang-orang samudra yang tersisa dan kemudian dunia permukaan. Yang menghalangi jalannya adalah Arthur Curry, saudara setengah manusia Orm, saudara setengah-Atlantis dan pewaris sejati takhta.",
            "69",
            "2j 23m",
            "Action, Adventure, Fantasy ",
            "12/21/2018",
            R.drawable.poster_aquaman))
        courses.add(MovieEntity("4",
            "Bohemian Rhapsody (2018)",
            "Penyanyi Freddie Mercury, gitaris Brian May, drummer Roger Taylor dan gitaris bass John Deacon menggemparkan dunia musik saat mereka membentuk band rock 'n' roll Queen pada tahun 1970. Lagu-lagu hit menjadi klasik instan. Ketika gaya hidup Mercury yang semakin liar mulai lepas kendali, Queen segera menghadapi tantangan terbesarnya - menemukan cara untuk menjaga band tetap bersama di tengah kesuksesan dan kelebihan.",
            "80",
            "2j 15m",
            "A Music, Drama, History  ",
            "11/02/2018",
            R.drawable.poster_bohemian))
        courses.add(MovieEntity("5",
            "Cold Pursuit (2019)",
            "Kehidupan keluarga yang tenang dari Nels Coxman, seorang pengemudi bajak salju, berubah setelah pembunuhan putranya. Nels memulai perburuan dendam untuk Viking, raja obat bius yang dianggapnya bertanggung jawab atas pembunuhan tersebut, melenyapkan rekan-rekan Viking satu per satu. Saat Nels semakin dekat dengan Viking, tindakannya membawa konsekuensi yang lebih tidak terduga dan kejam, karena ia membuktikan bahwa balas dendam ada dalam eksekusi.",
            "57",
            "1j 59m",
            " Action, Crime, Thriller  ",
            "02/08/2019",
            R.drawable.poster_cold_persuit))
        courses.add(MovieEntity("6",
            "Creed II (2018)",
            "Antara kewajiban pribadi dan pelatihan untuk pertarungan besar berikutnya melawan lawan yang terkait dengan masa lalu keluarganya, Adonis Creed menghadapi tantangan dalam hidupnya.",
            "69",
            "2j 10m",
            " Drama ",
            " 11/21/2018",
            R.drawable.poster_creed))
        courses.add(MovieEntity("7",
            "Fantastic Beasts: The Crimes of Grindelwald (2018)  ",
            "Gellert Grindelwald telah lolos dari penjara dan mulai mengumpulkan pengikut untuk tujuannya — mengangkat penyihir di atas semua makhluk non-sihir. Satu-satunya yang mampu menghentikannya adalah penyihir yang pernah dia panggil teman terdekatnya, Albus Dumbledore. Namun, Dumbledore perlu mencari bantuan dari penyihir yang pernah menggagalkan Grindelwald, mantan muridnya Newt Scamander, yang setuju untuk membantu, tidak menyadari bahaya yang ada di depan. Garis dibuat saat cinta dan kesetiaan diuji, bahkan di antara teman dan keluarga yang paling sejati, dalam sihir yang semakin terbagi.",
            "69",
            "2j 14m",
            "Adventure, Fantasy, Drama ",
            "11/16/2018",
            R.drawable.poster_crimes))
        courses.add(MovieEntity("8",
            "Glass (2019)",
            "Dalam serangkaian pertemuan yang meningkat, mantan penjaga keamanan David Dunn menggunakan kemampuan supernaturalnya untuk melacak Kevin Wendell Crumb, seorang pria yang memiliki dua puluh empat kepribadian yang terganggu. Sementara itu, kehadiran bayangan Elijah Price muncul sebagai seorang orkestra yang menyimpan rahasia penting bagi keduanya.",
            "67",
            "2j 9m",
            "Thriller, Drama, Science Fiction ",
            " 01/18/2019 ",
            R.drawable.poster_glass))
        courses.add(MovieEntity("9",
            "How to Train Your Dragon: The Hidden World (2019)",
            "Saat Hiccup memenuhi mimpinya untuk menciptakan utopia naga yang damai, penemuan Toothless tentang pasangan yang liar dan sulit dipahami menarik Night Fury menjauh. Ketika bahaya memuncak di rumah dan pemerintahan Hiccup sebagai kepala desa diuji, baik naga maupun penunggangnya harus membuat keputusan yang mustahil untuk menyelamatkan jenis mereka.",
            "78",
            "1j 44m",
            "Animation, Family, Adventure ",
            "01/09/2019",
            R.drawable.poster_how_to_train))
        courses.add(MovieEntity("10",
            " Avengers: Infinity War (2018)",
            "Ketika Avengers dan sekutunya terus melindungi dunia dari ancaman yang terlalu besar untuk ditangani oleh satu pahlawan, bahaya baru telah muncul dari bayang-bayang kosmik: Thanos. Seorang lalim penghujatan intergalaksi, tujuannya adalah untuk mengumpulkan semua enam Batu Keabadian, artefak dengan kekuatan yang tak terbayangkan, dan menggunakannya untuk menimbulkan keinginan bengkoknya pada semua kenyataan. Segala sesuatu yang telah diperjuangkan Avengers mengarah hingga saat ini - nasib Bumi dan keberadaannya sendiri tidak pernah lebih pasti.",
            "83",
            "2j 29m",
            "Adventure, Action, Science Fiction",
            "04/27/2018",
            R.drawable.poster_infinity_war))
        courses.add(MovieEntity("11",
            "Mary Queen of Scots (2018)   ",
            "Pada tahun 1561, Mary Stuart, janda Raja Prancis, kembali ke Skotlandia, merebut kembali tahtanya yang sah dan mengancam masa depan Ratu Elizabeth I sebagai penguasa Inggris, karena ia memiliki klaim yang sah atas takhta Inggris. Pengkhianatan, pemberontakan, konspirasi, dan pilihan hidup mereka sendiri membahayakan kedua Ratu. Mereka mengalami biaya pahit kekuasaan, hingga nasib tragis mereka akhirnya terwujud.",
            "66",
            "2j 4m",
            " Drama, History ",
            " 12/21/2018",
            R.drawable.poster_marry_queen))
        courses.add(MovieEntity("12",
            "Master Z: Ip Man Legacy (2018) ",
            "Menyusul kekalahannya dari Tuan Ip, Cheung Tin Chi mencoba hidup bersama putranya yang masih kecil di Hong Kong, menunggu meja di bar yang melayani ekspatriat. Tapi itu tidak lama sebelum campuran orang asing, uang, dan pemimpin tiga serangkai menariknya sekali lagi ke pertarungan.",
            "60",
            "1j 47m",
            " Action ",
            " 12/26/2018 ",
            R.drawable.poster_master_z))





        return courses
    }

    fun generateTV(): List<TvEntity> {

        val tv = ArrayList<TvEntity>()

        tv.add(TvEntity("t1",
                "Arrow (2012)",
                "Playboy miliarder manja Oliver Queen hilang dan diduga tewas saat yacht-nya hilang di laut. Dia kembali lima tahun kemudian sebagai pria yang berubah, bertekad untuk membersihkan kota sebagai main hakim sendiri berkerudung yang bersenjatakan busur.",
                "66",
                "42m",
                " Crime, Drama, Mystery, Action & Adventure  ",
                "2012",
                R.drawable.poster_arrow))
        tv.add(TvEntity("t2",
                "Doom Patrol (2019)",
                "Anggota Doom Patrol masing-masing mengalami kecelakaan mengerikan yang memberi mereka kemampuan super - tetapi juga membuat mereka terluka dan cacat. Trauma dan tertindas, tim menemukan tujuan melalui The Chief, yang mengumpulkan mereka untuk menyelidiki fenomena paling aneh yang ada - dan untuk melindungi Bumi dari apa yang mereka temukan.",
                "76",
                "49m",
                " Sci-Fi & Fantasy, Comedy, Drama  ",
                "02/15/2019",
                R.drawable.poster_doom_patrol))
        tv .add(TvEntity("t3",
                "Dragon Ball (1986)",
                "Dahulu kala di pegunungan, seorang ahli pertempuran yang dikenal sebagai Gohan menemukan seorang anak lelaki aneh yang dia beri nama Goku. Gohan membesarkannya dan melatih Goku dalam seni bela diri sampai dia meninggal. Anak laki-laki muda dan sangat kuat itu sendirian, tetapi dengan mudah diatur. Kemudian suatu hari, Goku bertemu dengan seorang gadis remaja bernama Bulma, yang pencariannya akan Bola Naga mistis membawanya ke rumah Goku. Bersama-sama, mereka berangkat untuk menemukan ketujuh orang itu dan mengabulkan keinginannya.",
                "81",
                "25m",
                " Animation, Action & Adventure, Sci-Fi & Fantasy ",
                "02/26/1986",
                R.drawable.poster_dragon_ball))
        tv.add(TvEntity("t4",
                "Fairy Tail (2009)",
                "Lucy adalah seorang gadis berusia 17 tahun, yang ingin menjadi penyihir sejati. Suatu hari ketika mengunjungi Kota Harujion, dia bertemu dengan Natsu, seorang pemuda yang mudah sakit dengan segala jenis transportasi. Tapi Natsu bukan sembarang anak biasa, dia adalah anggota dari salah satu guild penyihir paling terkenal di dunia: Fairy Tail.",
                "78",
                "25m",
                " Action & Adventure, Animation, Comedy, Sci-Fi & Fantasy, Mystery ",
                "10/12/2009",
                R.drawable.poster_fairytail))
        tv.add(TvEntity("t5",
                "Family Guy (1999)",
                "Serial animasi yang sakit, bengkok, tidak benar secara politis, dan Freakin 'Sweet yang menampilkan petualangan keluarga Griffin yang disfungsional. Peter yang kikuk dan Lois yang sabar memiliki tiga anak. Stewie (bayi yang brilian tapi sadis bertekad membunuh ibunya dan mengambil alih dunia), Meg (yang tertua, dan gadis paling tidak populer di kota) dan Chris (anak tengah, dia tidak terlalu cerdas tetapi memiliki hasrat untuk film ). Anggota terakhir dari keluarga adalah Brian - anjing yang bisa berbicara dan lebih dari sekadar hewan peliharaan, dia terus mengawasi Stewie sambil menyesap Martini dan memilah-milah masalah hidupnya sendiri.",
                "70 ",
                "22m",
                "Animation, Comedy",
                "01/31/1999",
                R.drawable.poster_family_guy))
        tv.add(TvEntity("t6",
                "The Flash (2014)",
                "Setelah akselerator partikel menyebabkan badai dahsyat, Penyelidik CSI Barry Allen disambar petir dan jatuh koma. Berbulan-bulan kemudian dia terbangun dengan kekuatan kecepatan super, memberinya kemampuan untuk bergerak melalui Central City seperti malaikat pelindung yang tak terlihat. Meskipun awalnya bersemangat dengan kekuatan barunya, Barry terkejut menemukan dia bukan satu-satunya \"meta-manusia\" yang diciptakan setelah ledakan akselerator - dan tidak semua orang menggunakan kekuatan baru mereka untuk kebaikan. Barry bermitra dengan S.T.A.R. Labs dan mendedikasikan hidupnya untuk melindungi yang tidak bersalah. Untuk saat ini, hanya beberapa teman dekat dan rekan yang tahu bahwa Barry secara harfiah adalah manusia tercepat yang hidup, tetapi tidak lama lagi dunia akan mengetahui apa yang telah menjadi Barry Allen ... The Flash.",
                "77",
                "44m",
                "Drama, Sci-Fi & Fantasy",
                " 10/7/2014",
                R.drawable.poster_flash))
        tv.add(TvEntity("t7",
                "Game of Thrones (2011)",
                "Tujuh keluarga bangsawan berjuang untuk menguasai tanah mitos Westeros. Friksi antar rumah menyebabkan perang skala penuh. Sementara kejahatan yang sangat kuno terbangun di utara terjauh. Di tengah perang, tatanan ketidakcocokan militer yang terabaikan, Night's Watch, adalah semua yang berdiri di antara alam manusia dan kengerian es di sekitarnya.",
                "84",
                "1j",
                " Sci-Fi & Fantasy, Drama, Action & Adventure  ",
                "4/17/2011",
                R.drawable.poster_god))
        tv.add(TvEntity("t8",
                "Gotham (2014)",
                "Semua orang tahu nama Komisaris Gordon. Dia adalah salah satu musuh terbesar dunia kejahatan, seorang pria yang reputasinya identik dengan hukum dan ketertiban. Tapi apa yang diketahui dari kisah Gordon dan kebangkitannya dari detektif pemula menjadi Komisaris Polisi? Apa yang diperlukan untuk menavigasi berbagai lapisan korupsi yang diam-diam menguasai Kota Gotham, tempat berkembang biaknya penjahat paling ikonik di dunia? Dan keadaan apa yang menciptakan mereka - persona yang lebih besar dari kehidupan yang akan menjadi Catwoman, The Penguin, The Riddler, Two-Face dan The Joker?",
                "75",
                "43m",
                " Drama, Crime, Sci-Fi & Fantasy  ",
                " 09/22/2014 ",
                R.drawable.poster_gotham))
        tv.add(TvEntity("t9",
                "Grey's Anatomy (2005)",
                "Mengikuti kehidupan pribadi dan profesional sekelompok dokter di Rumah Sakit Memorial Gray Sloan di Seattle.",
                "82",
                "43m",
                " Drama ",
                "03/27/2005",
                R.drawable.poster_grey_anatomy))
        tv.add(TvEntity("t10",
                "Hanna (2019)",
                "Drama thriller dan drama coming-of-age ini mengikuti perjalanan seorang gadis muda yang luar biasa saat dia menghindari pengejaran tanpa henti dari agen CIA di luar buku dan mencoba untuk mengungkap kebenaran di balik siapa dia. Berdasarkan film Joe Wright 2011.",
                "75",
                "50m",
                " Action & Adventure, Drama  ",
                "03/28/2019",
                R.drawable.poster_hanna))
        tv.add(TvEntity("t11",
                "Marvel's Iron Fist (2017)",
                "Danny Rand muncul kembali 15 tahun setelah dianggap meninggal. Sekarang, dengan kekuatan Iron Fist, dia berusaha merebut kembali masa lalunya dan memenuhi takdirnya.",
                "66",
                "55m",
                "Action & Adventure, Drama, Sci-Fi & Fantasy",
                " 03/17/2017",
                R.drawable.poster_iron_fist))
        tv.add(TvEntity("t12",
                "Naruto Shippūden (2007)",
                "Naruto Shippuuden adalah kelanjutan dari serial TV animasi asli Naruto. Ceritanya berkisar pada Uzumaki Naruto yang lebih tua dan sedikit lebih dewasa dan upayanya untuk menyelamatkan temannya Uchiha Sasuke dari cengkeraman Shinobi yang mirip ular, Orochimaru. Setelah 2 setengah tahun Naruto akhirnya kembali ke desanya di Konoha, dan mulai menjalankan ambisinya, meskipun itu tidak akan mudah, karena Dia telah mengumpulkan beberapa musuh (yang lebih berbahaya), seperti organisasi shinobi. ; Akatsuki.",
                "86",
                "25m",
                "Animation, Action & Adventure, Sci-Fi & Fantasy",
                " 02/15/2007 ",
                R.drawable.poster_naruto_shipudden))





        return tv
    }

    fun Username ()= arrayOf("JakeWharton",
            "amitshekhariitbhu",
            "romainguy",
            "chrisbanes",
            "tipsy",
            "ravi8x",
            "jasoet",
            "budioktaviyan",
            "hendisantika",
            "sidiqpermana")

}