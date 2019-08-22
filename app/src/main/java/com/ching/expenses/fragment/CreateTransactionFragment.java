package com.ching.expenses.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.PopupMenu;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ching.expenses.R;

import java.util.ArrayList;

public class CreateTransactionFragment extends Fragment {

    private ArrayList<String> categoryList;
    private TextView categoryTV;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.create_expense,container,false);
    }




    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final Context context = view.getContext();

        categoryList = new ArrayList<>();

        categoryList.add("Travel");
        categoryList.add("Groceries");
        categoryList.add("Rent");

        Spinner spinner = view.findViewById(R.id.categorySpinner);
        ArrayAdapter adapter = new ArrayAdapter(view.getContext(),android.R.layout.simple_dropdown_item_1line, categoryList);
        spinner.setAdapter(adapter);






//        categoryTV = view.findViewById(R.id.categorySelected);
//
//        categoryTV.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                PopupMenu popupMenu = new PopupMenu(context,view);
//
//                popupMenu.getMenu().clear();
//                for(String category:categoryList){
//                    popupMenu.getMenu().add(category);
//                }
//                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//                    @Override
//                    public boolean onMenuItemClick(MenuItem menuItem) {
//                        categoryTV.setText(menuItem.getTitle());
//                        return false;
//                    }
//                });
//
//                popupMenu.show();;
//            }
//        });

//        registerForContextMenu(categoryTV);

    }


//    @Override
//    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
//
//        menu.clear();
//        for(String category:categoryList){
//            menu.add(category);
//        }
//
//        super.onCreateContextMenu(menu, v, menuInfo);
//
//    }
//
//    @Override
//    public boolean onContextItemSelected(MenuItem item) {
//
//        categoryTV.setText(item.getTitle());
//
//        return super.onContextItemSelected(item);
//    }
}
