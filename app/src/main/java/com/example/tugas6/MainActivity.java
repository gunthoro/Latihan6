package com.example.tugas6;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.AbstractCollection;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private laptopadapter laptopadapter;
    private ArrayList<modellaptop> modellaptop;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        getDAta();


        recyclerView = findViewById(R.id.laptop);
        laptopadapter = new laptopadapter(modellaptop);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(laptopadapter);

        laptopadapter.setOnItemClickListener(new laptopadapter.OnItemClickListener() {
            @Override
            public void onItemClick(modellaptop model) {

                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("name_brg", model.getNamalaptop());
                intent.putExtra("desc_brg", getDesc(model.getNamalaptop()));
                intent.putExtra("price_brg", getHarga(model.getNamalaptop()));
                intent.putExtra("pic_brg", model.getGambarlaptop());
                startActivity(intent);
            }
        });
    }
    private void getDAta() {
        modellaptop = new ArrayList<>();
        modellaptop.add(new modellaptop("ROG Strix SCAR 16 (2024) G634", R.drawable.item_1, "Intel® Core™ i9 Processor 14900HX 2.2 GHz (36MB Cache, up to 5.8 GHz, 24 cores, 32 Threads)", 69000000.0));
        modellaptop.add(new modellaptop("ROG Strix G16 (2024) G614", R.drawable.item_2, "Intel® Core™ i9 Processor 14900HX 2.2 GHz", 32000000.0));
        modellaptop.add(new modellaptop("ROG Zephyrus G14 (2024) GA403", R.drawable.item_3, "AMD Ryzen™ 7 8845HS Processor 3.8GHz ", 29000000.0));
        modellaptop.add(new modellaptop("ROG Zephyrus G16 (2024) GU605", R.drawable.item_4, "Intel® Core™ Ultra 7 Processor 155H ", 33000000.0));
        modellaptop.add(new modellaptop("ROG Flow Z13 (2023) GZ301", R.drawable.item_5, "13th Gen Intel® Core™ i9-13900H Processor 2.6 GHz ", 34000000.0));
        modellaptop.add(new modellaptop("MSI Titan 18 HX A14V", R.drawable.item_6, "Intel® Core™ i9 processor 14900HX", 90000000.0));
        modellaptop.add(new modellaptop("MSI Titan GT77 HX 13V", R.drawable.item_7, "13th Gen Intel® Core™ i9-13980HX processor", 90000000.0));
        modellaptop.add(new modellaptop("MSI Crosshair 15 - B12U", R.drawable.item_8, "Up to 12th Gen Intel® Core™ i9 Processor", 28000000.0));
        modellaptop.add(new modellaptop("MSI Vector GP78 HX 13V", R.drawable.item_9, "13th Gen Intel® Core™ i9-13980HX processor", 50000000.0));
        modellaptop.add(new modellaptop("MSI Raider GE78 HX Smart Touchpad 13V", R.drawable.item_10, "13th Gen Intel® Core™ i9-13980HX processor", 25000000.0));
        modellaptop.add(new modellaptop("Razer Blade 16 S9-NT i9-13950HX RTX 4080", R.drawable.item_11, "PROCESSOR : 13th Gen Intel® Core™ i9-13950HX 5.5 GHz, Boost up to 5.5 GHz, 24 Cores / 32 Threads", 68000000.0));
        modellaptop.add(new modellaptop("Razer Blade 16 S9-NT i9-13950HX RTX 4070", R.drawable.item_12, "PROCESSOR : 13th Gen Intel® Core™ i9-13950HX 5.5 GHz, Boost up to 5.5 GHz, 24 Cores / 32 Threads", 57000000.0));
        modellaptop.add(new modellaptop("Razer Blade 15 Advanced 2022 Intel 12th Gen RTX 3080", R.drawable.item_13, "1.8GHz 14-core Intel i7-12800H processor, Turbo Boost up to 4.8GHz, with 24MB of Cache", 59000000.0));
        modellaptop.add(new modellaptop("Razer Blade 15 Advanced 2022 Intel 12th Gen RTX 3070", R.drawable.item_14, "1.8GHz 14-core Intel i7-12800H processor", 46000000.0));
        modellaptop.add(new modellaptop("Razer Blade 15 Intel 13th gen i7-13800H RTX4070", R.drawable.item_15, "Processor: 2.5GHz 14-core Intel i7-13800H", 53000000.0));

    }

    private String getDesc(String namalaptop) {
        for (modellaptop laptop : modellaptop) {
            if (laptop.getNamalaptop().equals(namalaptop)) {
                return laptop.getdescLaptop();
            }
        }
        return "";
    }

    private double getHarga(String namalaptop) {
        for (modellaptop laptop : modellaptop) {
            if (laptop.getNamalaptop().equals(namalaptop)) {
                return laptop.gethargaLaptop();
            }
        }
        return 0.0;
    }

}