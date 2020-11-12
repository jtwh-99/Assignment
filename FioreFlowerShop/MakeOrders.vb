Public Class MakeOrders


    Private Sub btnOrder_Click(sender As Object, e As EventArgs) Handles btnOrder.Click

        MessageBox.Show("Your Order Have Been Placed.")
        Me.Close()
        Form1.Show()
        'Dim result As DialogResult = MessageBox.Show("Confirm Your Order?", "Confirm Order", MessageBoxButtons.YesNo)
        'If result = DialogResult.OK Then

        'Else

        'End If
    End Sub

    Private Sub radPickUp_CheckedChanged(sender As Object, e As EventArgs) Handles radPickUp.CheckedChanged
        If radPickUp.Checked Then
            GroupBox4.Enabled = False
            GroupBox3.Enabled = True
        End If
    End Sub

    Private Sub radDelivery_CheckedChanged(sender As Object, e As EventArgs) Handles radDelivery.CheckedChanged
        If radDelivery.Checked Then
            GroupBox3.Enabled = False
            GroupBox4.Enabled = True
        End If
    End Sub

    Private Sub MakeOrders_Load(sender As Object, e As EventArgs) Handles Me.Load
        numLily.Value = 0
        numOrchid.Value = 0
        numRose.Value = 0
        txtTime.Text = ""
        txtAddress.Text = ""
        lblTotalPrice.Text = ""
    End Sub

    Private Sub numRose_ValueChanged(sender As Object, e As EventArgs) Handles numRose.ValueChanged
        lblTotalPrice.Text = (numLily.Value + numOrchid.Value + numRose.Value) * 10

    End Sub

    Private Sub numOrchid_ValueChanged(sender As Object, e As EventArgs) Handles numOrchid.ValueChanged
        lblTotalPrice.Text = (numLily.Value + numOrchid.Value + numRose.Value) * 10

    End Sub

    Private Sub numLily_ValueChanged(sender As Object, e As EventArgs) Handles numLily.ValueChanged
        lblTotalPrice.Text = (numLily.Value + numOrchid.Value + numRose.Value) * 10

    End Sub


End Class