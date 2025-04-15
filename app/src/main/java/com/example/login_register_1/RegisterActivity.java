package com.example.login_register_1;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    private EditText etNewUsername, etNewPassword, etConfirmPassword;
    private Button btnRegister, btnBackToLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);
        etNewUsername    = findViewById(R.id.etNewUsername);
        etNewPassword    = findViewById(R.id.etNewPassword);
        etConfirmPassword= findViewById(R.id.etConfirmPassword);
        btnRegister      = findViewById(R.id.btnRegister);
        btnBackToLogin   = findViewById(R.id.btnBackToLogin);

        btnRegister.setOnClickListener(v -> {
            String user = etNewUsername.getText().toString().trim();
            String pass = etNewPassword.getText().toString().trim();
            String confirm = etConfirmPassword.getText().toString().trim();
            if (TextUtils.isEmpty(user) || TextUtils.isEmpty(pass) || TextUtils.isEmpty(confirm)) {
                Toast.makeText(this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
            } else if (!pass.equals(confirm)) {
                Toast.makeText(this, "Mật khẩu xác nhận không khớp", Toast.LENGTH_SHORT).show();
            } else {
                // TODO: lưu thông tin user vào CSDL hoặc gọi API đăng ký
                Toast.makeText(this, "Đăng ký thành công", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        btnBackToLogin.setOnClickListener(v -> finish());
    }
}
