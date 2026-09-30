package com.example.mobileappminggu3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import org.jetbrains.compose.resources.painterResource
import mobileappminggu3.shared.generated.resources.Res
import mobileappminggu3.shared.generated.resources.firman_luthfiansyah_id_card_1

@Composable
@Preview
fun App() {
    MaterialTheme {
        ProfileScreen(
            name = "Firman Luthfiansyah",
            nim = "124140044",
            bio = "Mahasiswa Informatika yang tertarik pada pengembangan aplikasi mobile dan teknologi modern.",
            email = "firmanluthfidev@gmail.com",
            phone = "+62 812-3456-7890",
            location = "Lampung, Indonesia",
        )
    }
}

@Composable
fun ProfileScreen(
    name: String,
    nim: String,
    bio: String,
    email: String,
    phone: String,
    location: String,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 20.dp, vertical = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        ProfileHeader(
            name = name,
            nim = nim,
            bio = bio,
        )

        Spacer(modifier = Modifier.height(12.dp))

        ProfileInfoItem(label = "Email", value = email)
        ProfileInfoItem(label = "Phone", value = phone)
        ProfileInfoItem(label = "Location", value = location)

        Spacer(modifier = Modifier.height(18.dp))

        ProfileActionButton(label = "Klik Saya")
    }
}

@Composable
fun ProfileHeader(
    name: String,
    nim: String,
    bio: String,
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(Res.drawable.firman_luthfiansyah_id_card_1),
            contentDescription = "Foto profil Firman Luthfiansyah",
            modifier = Modifier
                .size(110.dp)
                .clip(CircleShape)
                .border(3.dp, Color(0xFFFFA000), CircleShape),
            contentScale = ContentScale.Crop,
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = name,
            color = Color.Black,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
        )

        Text(
            text = "NIM: $nim",
            color = Color.DarkGray,
            fontSize = 14.sp,
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = bio,
            color = Color.Gray,
            fontSize = 14.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth(),
        )
    }
}

@Composable
fun ProfileInfoItem(label: String, value: String) {
    Text(
        text = "$label: $value",
        color = Color.DarkGray,
        fontSize = 14.sp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
    )
}

@Composable
fun ProfileActionButton(label: String) {
    Button(
        onClick = { },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFFFFA000),
            contentColor = Color.White,
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp),
    ) {
        Text(text = label)
    }
}
