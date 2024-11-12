package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class UserBottomSheet extends BottomSheetDialogFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.user_activity, container, false);

        // Initialize views
        ImageView icAvatar = view.findViewById(R.id.ic_avatar);
        TextView txtEditInfo = view.findViewById(R.id.txt_edit_info);
        TextView txtRentedVehicles = view.findViewById(R.id.txt_rented_vehicles);
        TextView txtPastRentals = view.findViewById(R.id.txt_past_rentals);
        TextView txtLogout = view.findViewById(R.id.txt_logout);

        // Set click listeners
//        icAvatar.setOnClickListener(v -> {
//            // Chuyển đến trang chỉnh sửa thông tin cá nhân hoặc thay đổi avatar
//            Intent intent = new Intent(getActivity(), EditProfileActivity.class);
//            startActivity(intent);
//        });
//
//        txtEditInfo.setOnClickListener(v -> {
//            Intent intent = new Intent(getActivity(), EditInfoActivity.class);
//            startActivity(intent);
//        });
//
//        txtRentedVehicles.setOnClickListener(v -> {
//            Intent intent = new Intent(getActivity(), RentedVehiclesActivity.class);
//            startActivity(intent);
//        });
//
//        txtPastRentals.setOnClickListener(v -> {
//            Intent intent = new Intent(getActivity(), PastRentalsActivity.class);
//            startActivity(intent);
//        });

        txtLogout.setOnClickListener(v -> {
            Toast.makeText(getActivity(), "Đăng xuất thành công", Toast.LENGTH_SHORT).show();
            dismiss(); // Đóng BottomSheet sau khi đăng xuất
        });

        return view;
    }
}
