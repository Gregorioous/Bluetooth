package com.example.bluetoothchat.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.bluetoothchat.presentation.BluetoothUiState

@Composable
fun DeviceScreen(state: BluetoothUiState,
                 onStartScan: () -> Unit,
                 onStopScan: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        BluetoothDeviceList(
            pairedDevices = state.pairedDevice,
            scannedDevices = state.scannedDevices,
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            ButtonScan(text = "Start scan", onClick = onStartScan)
            ButtonScan(text = "Stop scan", onClick = onStopScan)
        }
        }
    }
