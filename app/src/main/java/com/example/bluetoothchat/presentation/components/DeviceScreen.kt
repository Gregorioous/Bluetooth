package com.example.bluetoothchat.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.bluetoothchat.R
import com.example.bluetoothchat.presentation.BluetoothUiState

@Composable
fun DeviceScreen(state: BluetoothUiState,
                 onStartScan: () -> Unit,
                 onStopScan: () -> Unit) {
    Column( modifier = Modifier.fillMaxSize()) {

        BluetoothDeviceList(
            pairedDevices = state.pairedDevice,
            scannedDevices = state.scannedDevices,
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        )

        Row( modifier = Modifier.padding(8.dp)) {
            ButtonScan( text = stringResource(id = R.string.startScan),
                onClick = {},
                modifier = Modifier.layoutId("first_button"))

            ButtonScan( text = stringResource(id = R.string.stopScan),
                onClick = {},
                modifier = Modifier.layoutId("second_button"))

            ButtonScan( text = stringResource(id = R.string.startServer),
                onClick = {},
                modifier = Modifier.layoutId("third_button"))
        }
    }
}