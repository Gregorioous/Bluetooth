package com.example.bluetoothchat.presentation.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bluetoothchat.R

@Composable
fun ButtonScan(text: String, onClick: () -> Unit,
               modifier: Modifier = Modifier,
               shape: Shape = RoundedCornerShape(10.dp),
               elevation: ButtonElevation? = ButtonDefaults.buttonElevation(),
) {
    Button(
        onClick = {
            onClick()
        },
        elevation = elevation,
        shape = shape,
        modifier = modifier
            .wrapContentHeight(),

        ) {
        Text(
            text = text,
            fontSize = 14.sp,
            color = colorResource(id = R.color.white),
            fontFamily = FontFamily(Font(R.font.montserrat_semi_bold)),
            modifier = Modifier.padding(vertical = 4.dp),
            overflow = TextOverflow.Ellipsis,
            maxLines = 1
        )
    }
}