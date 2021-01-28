package com.nida.idn.dzikir_digital

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nida.idn.dzikir_digital.Adapter.ViewPagerAdapterDoa
import com.nida.idn.dzikir_digital.Data.DataDoaPilihan
import kotlinx.android.synthetic.main.activity_doa_pilihan.*

class DoaPilihanActivity : AppCompatActivity() {

    private val adapterDoa = ViewPagerAdapterDoa(
        listOf(
            DataDoaPilihan(
                "Doa-Doa Pilihan",
                "[1] Doa Shalat Duha",
                "اَللّٰهُمَّ اِنَّ الضُّحَآءَ ضُحَاءُكَ وَالْبَهَآءَ بَهَاؤُكَ وَالْجَمَالَ جَمَالُكَ وَالْقُوَّةَ قُوَّتُكَ وَالْقُدْرَةَ قُدْرَتُكَ وَالْعِصْمَةَ عِصْمَتُكَ\n" +
                        "اَللّٰهُمَّ اِنْ كَانَ رِزْقِى فِى السَّمَآءِ فَأَنْزِلْهُ وَاِنْ كَانَ فِى اْلاَرْضِ فَأَخْرِجْهُ وَاِنْ كَانَ مُعَسِّرًا فَيَسِّرْهُ وَاِنْ كَانَ حَرَامًا فَطَهِّرْهُ وَاِنْ كَانَ بَعِيْدًا فَقَرِّبْهُ بِحَقِّ ضُحَاءِكَ وَبَهَاءِكَ وَجَمَالِكَ وَقُوَّتِكَ وَقُدْرَتِكَ اٰتِنِيْ مَااٰتَيْتَ عِبَادَكَ الصَّالِحِيْ\n",
                "Allahumma innad-duhaa'a duhaa'uka wal bahaa'a bahaa'auka wal-jamaala jamaaluka wal-quwwata quwwatuka wal-qudrota qudratuka wal-'ismata 'ismatuka." +
                        "Allaahumma in kaana rizqii fis-samaa’i fa anzilhu, wa in kaana fil-ardi fa akhrijhu, wa in kaana mu’assiran fa yassirhu, wa in kaana haraaman fa tahhirhu wa in kaana ba’iidan fa qarribhu bi haqqi duhaa’ika wa bahaa’ika wa jamaalika wa quwwatika wa qudratika, aatinii maa aataita ‘ibaadakash-shalihiin\n",
                "“Ya Allah, sesungguhnya waktu Dhuha adalah waktu Dhuha-Mu, keagungan adalah keagungan-Mu, keindahan adalah keindahan-Mu, kekuatan adalah kekuatan-Mu, penjagaan adalah penjagaan-Mu”\n" +
                        "\n" +
                        "“Ya Allah, apabila rezekiku berada di atas langit maka turunkanlah, apabila berada di dalam bumi maka keluarkanlah, apabila sukar mudahkanlah, apabila haram sucikanlah, apabila jauh dekatkanlah dengan kebenaran dhuha-Mu, kekuasaan-Mu (wahai Tuhanku), datangkanlah padaku apa yang Engkau datangkan kepada hamba-hamba-Mu yang sholeh”\n",
                "“Di pagi hari ada kewajiban bagi seluruh persendian kalian untuk bersedekah. Maka setiap bacaan tasbih adalah sedekah, setiap bacaan tahmid adalah sedekah, setiap bacaan tahlil adalah sedekah, dan setiap bacaan takbir adalah sedekah. Demikian juga amar ma’ruf dan nahi mungkar adalah sedekah. Semua ini bisa dicukupi dengan melaksanakan shalat dhuha sebanyak dua raka’at” (HR. Muslim no. 720).\n"
            ), DataDoaPilihan(
                "Doa-Doa Pilihan",
                "[2] Doa Shalat Istikharah",
                "\n" +
                        "اللَّهُمَّ إِنِّيْ أَسْتَخِيْرُكَ بِعِلْمِكَ، وَأَسْتَقْدِرُكَ بِقُدْرَتِكَ، وَأَسْأَلُكَ مِنْ فَضْلِكَ الْعَظِيْمِ، فَإِنَّكَ تَقْدِرُ وَلاَ أَقْدِرُ، وَتَعْلَمُ وَلاَ أَعْلَمُ، وَأَنْتَ عَلاَّمُ الْغُيُوْبِ. اَللَّهُمَّ إِنْ كُنْتَ تَعْلَمُ أَنَّ هَذَا اْلأَمْرَ -وَيُسَمَّى حَاجَتَهُ- خَيْرٌ لِيْ فِيْ دِيْنِيْ وَمَعَاشِيْ وَعَاقِبَةِ أَمْرِيْ فَاقْدُرْهُ لِيْ وَيَسِّرْهُ لِيْ ثُمَّ بَارِكْ لِيْ فِيْهِ، وَإِنْ كُنْتَ تَعْلَمُ أَنَّ هَذَا اْلأَمْرَ شَرٌّ لِيْ فِيْ دِيْنِيْ وَمَعَاشِيْ وَعَاقِبَةِ أَمْرِيْ فَاصْرِفْهُ عَنِّيْ وَاصْرِفْنِيْ عَنْهُ وَاقْدُرْ لِيَ الْخَيْرَ حَيْثُ كَانَ ثُمَّ أَرْضِنِيْ بِهِ\n",
                "Allaahumma innii astakhiiru bi'ilmika wa astaqdiru bi qudratika as'aluka min fadhlikal a'zham fainnaka aqdiru wa ta'lamu wa laa a'lamu wa anta 'allaamul ghuyuubu. Allaahumma in kunta ta'lamu anna hadzal amra khairunlii fi diini wa ma'aasyi wa aaqibati amri faqdirhuli wa yassirhu lii tsumma baariklii fiihi wa in kunta ta'lamu anna hadzlamra syarrunlii fii diini wa ma'aasyi wa aaqibati amri fashrifhu 'anni fashrifni 'anhu waqdirliyal khaira haautsu kaana tsumma ardhini bihi innaka 'alaa kulli syai'in qadiir\n",
                "Ya Allah, apabila Engkau mengetahui bahwa urusan ini (menyebutkan persoalannya) adalah baik bagiku dalam agamaku, kehidupanku, dan akhir urusanku, maka tentukanlah untukku, mudahkanlah jalannya dan berkahilah aku di dalamnya.\n" +
                        "\n" +
                        "Dan apabila Engkau mengetahui bahwa urusan ini adalah buruk bagiku dalam agamaku, kehidupanku dan akhir urusanku, maka jauhkanlah ia dariku dan jauhkanlah diriku darinya, tentukanlah untukku apapun yang terbaik, kemudian jadikanlah aku ridha dengannya.\n",
                "Setiap muslim yang mengerjakan sholat istikharah akan jauh merasa lebih tenang dan tentram. Sehingga hal ini dapat memantapkan hati dan jiwanya saat akan membuat suatu keputusan. Selain itu, sholat istikharah juga dapat mendekatkan diri dan menyerahkan segalanya kepada Allah SWT.\n"
            ), DataDoaPilihan(
                "Doa-Doa Pilihan",
                "[3] Doa Sebelum Tidur",
                "بِسْمِكَ اللّهُمَّ اَحْيَا وَ بِسْمِكَ اَمُوْتُ",
                "Bismika Allahumma ahyaa wa bismika amuut",
                "Dengan nama-Mu ya Allah aku hidup, dan dengan nama-Mu aku mati",
                "(HR. Bukhori dan Muslim)"
            ), DataDoaPilihan(
                "Doa-Doa Pilihan",
                "[4] Doa Bangun Tidur",
                "اَلْحَمْدُ لِلَّهِ الَّذِيْ أَحْيَانَا بَعْدَ مَا أَمَاتَنَا وَإِلَيْهِ النُّشُوْرِ",
                "Alhamdullillahilladzi ahyaanaa bada maa amaatanaa wa ilaihin nushur",
                "Segala puji bagi-Mu, ya Allah, yang telah menghidupkan kembali diriku setelah kematianku, dan hanya kepada-Nya nantinya kami semua akan dihidupkan kembali.",
                "(HR.Ahmad, Bukhari, dan Muslim)."
            ), DataDoaPilihan(
                "Doa-Doa Pilihan",
                "[5] Doa Sebelum makan",
                "اَللَّهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ",
                "Alaahumma barik lanaa fiimaa razaqtanaa waqinaa ‘adzaa bannar",
                "Ya Allah, berkahilah untukku dalam sesuatu yang Engkau rezekikan kepadaku, dan peliharalah aku dari siksa neraka",
                " (HR.Ibnu Sunni)."
            ), DataDoaPilihan(
                "Doa-Doa Pilihan",
                "[6] Doa Setelah makan",
                "اَلْحَمْدُ ِللهِ الَّذِيْنَ اَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مِنَ الْمُسْلِمِيْنَ",
                "Alhamdu lillahhil-ladzi ath-amanaa wa saqaana waja’alanaa minal muslimiin",
                "Segala puji bagi Allah yang telah memberi kami makan dan minum serta menjadikan kami termasuk golongan orang muslim.",
                "(HR.Ahmad, Abu Dawud, Tirmidzi)."
            ), DataDoaPilihan(
                "Doa-Doa Pilihan",
                "[7] Doa Masuk Rumah",
                "اللّهُمَّ اِنِّىْ اَسْأَلُكَ خَيْرَالْمَوْلِجِ وَخَيْرالْمَخْرَجِ بِسْمِ اللهِ وَلَجْنَا وَبِسْمِ اللهِ خَرَجْنَا وَعَلَى اللهِ رَبَّنَا تَوَكَّلْنَا",
                "Allohumma innii asaluka khoirol mauliji wa khoirol makhroji bismillahi walajnaa wabismillahi khorojnaa wa’alallohi Robbanaa tawakalna",
                "Ya Allah, sesungguhnya aku mohon kepada-Mu baiknya tempat masuk dan baiknya tempat keluar dengan menyebut nama Allah kami masuk dan dengan menyebut nama Allah kami keluar dan kepada Allah Tuhan kami, kami bertawakal",
                "Jika seseorang memasuki rumahnya lantas ia menyebut nama Allah saat memasukinya, begitu pula saat ia makan, maka setan pun berkata (pada teman-temannya), “Kalian tidak ada tempat untuk bermalam dan tidak ada jatah makan.” Ketika ia memasuki rumahnya tanpa menyebut nama Allah ketika memasukinya, setan pun mengatakan (pada teman-temannya), “Saat ini kalian mendapatkan tempat untuk bermalam.” Ketika ia lupa menyebut nama Allah saat makan, maka setan pun berkata, “Kalian mendapat tempat bermalam dan jatah makan malam.” (HR. Muslim no. 2018).\n" +
                        "\n"
            ), DataDoaPilihan(
                "Doa-Doa Pilihan",
                "[8] Doa Keluar Rumah",
                "بِسْمِ اللهِ تَوَكَّلْتُ عَلىَ اللهِ لاَحَوْلَ وَلاَ قُوَّةَ اِلاَّ بِااللهِ",
                "Bismillahi tawakaltu ‘alallohi laahaulaa walaaquwwata illabillah",
                "Dengan menyebut nama Allah aku bertawakal kepada Allah, tiada daya kekuatan melainkan dengan Allah",
                "Artinya : Maka disampaikan kepadanya, ‘Kamu diberi petunjuk, kamu dicukupi kebutuhannya, dan kamu dilindungi.’ Seketika itu setan-setan pun menjauh darinya. Lalu salah satu setan berkata kepada temannya, ’Bagaimana mungkin kalian bisa mengganggu orang yang telah diberi petunjuk, dicukupi, dan dilindungi.’\n" +
                        "\n" +
                        "(HR. Abu Daud, no. 5095; Turmudzi, no. 3426; dinilai shahih oleh Al-Albani)"
            ), DataDoaPilihan(
                "Doa-Doa Pilihan",
                "[9] Doa Masuk Kamar Mandi",
                "اللّهُمَّ اِنِّي اَعُوْذُبِكَ مِنَ الْخُبُثِ وَالْخَبَا ئِثِ",
                "Allohumma innii a’uudzubika minal khubutsi walkhobaaits",
                "Ya Allah, aku berlindung dari godaan syetan kaki-laki dan perempuan",
                "Dari Anas bin Malik radhiallahu ‘anhu ia berkata: “Apabila Nabi shallallahu ‘alaihi wasallam  masuk atau datang ke tempat hajat (kamar mandi maupun toilet), beliau mengucapkan doa tersebut"
            ),DataDoaPilihan(
                "Doa-Doa Pilihan",
                "[10] Doa Keluar Kamar Mandi",
                "غُفْرَانَكَ الْحَمْدُلِلهِ الَّذِيْ اَذْهَبَ عَنِّ الْاَذَى وَعَافَانِىْ",
                "Ghufroonakal hamdulillahiladzi adzhaba ‘anniladzaa wa’aafaanii",
                "Dengan mengharap ampunan-Mu, segala puji milik Allah yang telah menghilangkan kotoran dari badanku dan yang telah menyejahterakan",
                "Sebagai bentuk rasa syukur telah dimudahkan dalam mengeluarkan kotoran-kotoran yang ada dalam tubuh kita, hendaknya setelah selesai menjalankan aktifitas di kamar mandi membaca doa keseharian ini."
        )
    )
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_pilihan)
        id_doapilihan.adapter = adapterDoa
    }
}

