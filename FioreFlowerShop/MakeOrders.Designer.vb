<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class MakeOrders
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()>
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()>
    Private Sub InitializeComponent()
        Me.GroupBox1 = New System.Windows.Forms.GroupBox()
        Me.numLily = New System.Windows.Forms.NumericUpDown()
        Me.numOrchid = New System.Windows.Forms.NumericUpDown()
        Me.numRose = New System.Windows.Forms.NumericUpDown()
        Me.lblRose = New System.Windows.Forms.Label()
        Me.lblOrchid = New System.Windows.Forms.Label()
        Me.lblLily = New System.Windows.Forms.Label()
        Me.GroupBox2 = New System.Windows.Forms.GroupBox()
        Me.radCashOnPickUp = New System.Windows.Forms.RadioButton()
        Me.radCashOnDelivery = New System.Windows.Forms.RadioButton()
        Me.GroupBox3 = New System.Windows.Forms.GroupBox()
        Me.txtTime = New System.Windows.Forms.TextBox()
        Me.lblTime = New System.Windows.Forms.Label()
        Me.lblDate = New System.Windows.Forms.Label()
        Me.DateTimePicker1 = New System.Windows.Forms.DateTimePicker()
        Me.btnOrder = New System.Windows.Forms.Button()
        Me.lblPrice = New System.Windows.Forms.Label()
        Me.lblTotalPrice = New System.Windows.Forms.Label()
        Me.radPickUp = New System.Windows.Forms.RadioButton()
        Me.radDelivery = New System.Windows.Forms.RadioButton()
        Me.GroupBox4 = New System.Windows.Forms.GroupBox()
        Me.txtAddress = New System.Windows.Forms.TextBox()
        Me.lblAddress = New System.Windows.Forms.Label()
        Me.GroupBox1.SuspendLayout()
        CType(Me.numLily, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.numOrchid, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.numRose, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.GroupBox2.SuspendLayout()
        Me.GroupBox3.SuspendLayout()
        Me.GroupBox4.SuspendLayout()
        Me.SuspendLayout()
        '
        'GroupBox1
        '
        Me.GroupBox1.Controls.Add(Me.numLily)
        Me.GroupBox1.Controls.Add(Me.numOrchid)
        Me.GroupBox1.Controls.Add(Me.numRose)
        Me.GroupBox1.Controls.Add(Me.lblRose)
        Me.GroupBox1.Controls.Add(Me.lblOrchid)
        Me.GroupBox1.Controls.Add(Me.lblLily)
        Me.GroupBox1.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.2!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.GroupBox1.Location = New System.Drawing.Point(30, 26)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Size = New System.Drawing.Size(283, 189)
        Me.GroupBox1.TabIndex = 0
        Me.GroupBox1.TabStop = False
        Me.GroupBox1.Text = "Flowers"
        '
        'numLily
        '
        Me.numLily.Location = New System.Drawing.Point(205, 149)
        Me.numLily.Name = "numLily"
        Me.numLily.Size = New System.Drawing.Size(41, 27)
        Me.numLily.TabIndex = 1
        '
        'numOrchid
        '
        Me.numOrchid.Location = New System.Drawing.Point(205, 91)
        Me.numOrchid.Name = "numOrchid"
        Me.numOrchid.Size = New System.Drawing.Size(41, 27)
        Me.numOrchid.TabIndex = 2
        '
        'numRose
        '
        Me.numRose.Location = New System.Drawing.Point(205, 29)
        Me.numRose.Name = "numRose"
        Me.numRose.Size = New System.Drawing.Size(41, 27)
        Me.numRose.TabIndex = 4
        '
        'lblRose
        '
        Me.lblRose.Location = New System.Drawing.Point(33, 33)
        Me.lblRose.Name = "lblRose"
        Me.lblRose.Size = New System.Drawing.Size(155, 23)
        Me.lblRose.TabIndex = 1
        Me.lblRose.Text = "Rose   (RM10.00) :"
        '
        'lblOrchid
        '
        Me.lblOrchid.Location = New System.Drawing.Point(33, 91)
        Me.lblOrchid.Name = "lblOrchid"
        Me.lblOrchid.Size = New System.Drawing.Size(155, 23)
        Me.lblOrchid.TabIndex = 2
        Me.lblOrchid.Text = "Orchid (RM10.00) :"
        '
        'lblLily
        '
        Me.lblLily.Location = New System.Drawing.Point(33, 149)
        Me.lblLily.Name = "lblLily"
        Me.lblLily.Size = New System.Drawing.Size(155, 23)
        Me.lblLily.TabIndex = 3
        Me.lblLily.Text = "Lily      (RM10.00) :"
        '
        'GroupBox2
        '
        Me.GroupBox2.Controls.Add(Me.radCashOnPickUp)
        Me.GroupBox2.Controls.Add(Me.radCashOnDelivery)
        Me.GroupBox2.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.2!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.GroupBox2.Location = New System.Drawing.Point(339, 26)
        Me.GroupBox2.Name = "GroupBox2"
        Me.GroupBox2.Size = New System.Drawing.Size(303, 189)
        Me.GroupBox2.TabIndex = 1
        Me.GroupBox2.TabStop = False
        Me.GroupBox2.Text = "Payment Method"
        '
        'radCashOnPickUp
        '
        Me.radCashOnPickUp.Location = New System.Drawing.Point(49, 119)
        Me.radCashOnPickUp.Name = "radCashOnPickUp"
        Me.radCashOnPickUp.Size = New System.Drawing.Size(204, 27)
        Me.radCashOnPickUp.TabIndex = 1
        Me.radCashOnPickUp.TabStop = True
        Me.radCashOnPickUp.Text = "Cash On Pick-Up"
        Me.radCashOnPickUp.UseVisualStyleBackColor = True
        '
        'radCashOnDelivery
        '
        Me.radCashOnDelivery.Location = New System.Drawing.Point(49, 60)
        Me.radCashOnDelivery.Name = "radCashOnDelivery"
        Me.radCashOnDelivery.Size = New System.Drawing.Size(204, 30)
        Me.radCashOnDelivery.TabIndex = 0
        Me.radCashOnDelivery.TabStop = True
        Me.radCashOnDelivery.Text = "Cash On Delivery"
        Me.radCashOnDelivery.UseVisualStyleBackColor = True
        '
        'GroupBox3
        '
        Me.GroupBox3.Controls.Add(Me.txtTime)
        Me.GroupBox3.Controls.Add(Me.lblTime)
        Me.GroupBox3.Controls.Add(Me.lblDate)
        Me.GroupBox3.Controls.Add(Me.DateTimePicker1)
        Me.GroupBox3.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.2!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.GroupBox3.Location = New System.Drawing.Point(30, 276)
        Me.GroupBox3.Name = "GroupBox3"
        Me.GroupBox3.Size = New System.Drawing.Size(283, 140)
        Me.GroupBox3.TabIndex = 0
        Me.GroupBox3.TabStop = False
        '
        'txtTime
        '
        Me.txtTime.Location = New System.Drawing.Point(69, 90)
        Me.txtTime.Multiline = True
        Me.txtTime.Name = "txtTime"
        Me.txtTime.Size = New System.Drawing.Size(200, 28)
        Me.txtTime.TabIndex = 9
        '
        'lblTime
        '
        Me.lblTime.Location = New System.Drawing.Point(6, 90)
        Me.lblTime.Name = "lblTime"
        Me.lblTime.Size = New System.Drawing.Size(56, 28)
        Me.lblTime.TabIndex = 8
        Me.lblTime.Text = "Time :"
        Me.lblTime.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'lblDate
        '
        Me.lblDate.Location = New System.Drawing.Point(5, 36)
        Me.lblDate.Name = "lblDate"
        Me.lblDate.Size = New System.Drawing.Size(57, 27)
        Me.lblDate.TabIndex = 1
        Me.lblDate.Text = "Date : "
        Me.lblDate.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'DateTimePicker1
        '
        Me.DateTimePicker1.Location = New System.Drawing.Point(69, 36)
        Me.DateTimePicker1.Name = "DateTimePicker1"
        Me.DateTimePicker1.Size = New System.Drawing.Size(200, 27)
        Me.DateTimePicker1.TabIndex = 0
        '
        'btnOrder
        '
        Me.btnOrder.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.2!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnOrder.Location = New System.Drawing.Point(525, 433)
        Me.btnOrder.Name = "btnOrder"
        Me.btnOrder.Size = New System.Drawing.Size(117, 41)
        Me.btnOrder.TabIndex = 2
        Me.btnOrder.Text = "Place Order"
        Me.btnOrder.UseVisualStyleBackColor = True
        '
        'lblPrice
        '
        Me.lblPrice.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.2!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblPrice.Location = New System.Drawing.Point(265, 433)
        Me.lblPrice.Name = "lblPrice"
        Me.lblPrice.Size = New System.Drawing.Size(131, 41)
        Me.lblPrice.TabIndex = 3
        Me.lblPrice.Text = "Total Price : RM"
        Me.lblPrice.TextAlign = System.Drawing.ContentAlignment.MiddleLeft
        '
        'lblTotalPrice
        '
        Me.lblTotalPrice.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.2!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblTotalPrice.Location = New System.Drawing.Point(402, 433)
        Me.lblTotalPrice.Name = "lblTotalPrice"
        Me.lblTotalPrice.Size = New System.Drawing.Size(112, 41)
        Me.lblTotalPrice.TabIndex = 4
        Me.lblTotalPrice.TextAlign = System.Drawing.ContentAlignment.MiddleLeft
        '
        'radPickUp
        '
        Me.radPickUp.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.2!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.radPickUp.Location = New System.Drawing.Point(67, 235)
        Me.radPickUp.Name = "radPickUp"
        Me.radPickUp.Size = New System.Drawing.Size(209, 24)
        Me.radPickUp.TabIndex = 5
        Me.radPickUp.TabStop = True
        Me.radPickUp.Text = "Pick-Up at Store"
        Me.radPickUp.UseVisualStyleBackColor = True
        '
        'radDelivery
        '
        Me.radDelivery.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.2!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.radDelivery.Location = New System.Drawing.Point(388, 235)
        Me.radDelivery.Name = "radDelivery"
        Me.radDelivery.Size = New System.Drawing.Size(104, 24)
        Me.radDelivery.TabIndex = 6
        Me.radDelivery.TabStop = True
        Me.radDelivery.Text = "Delivery"
        Me.radDelivery.UseVisualStyleBackColor = True
        '
        'GroupBox4
        '
        Me.GroupBox4.Controls.Add(Me.txtAddress)
        Me.GroupBox4.Controls.Add(Me.lblAddress)
        Me.GroupBox4.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.2!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.GroupBox4.Location = New System.Drawing.Point(339, 276)
        Me.GroupBox4.Name = "GroupBox4"
        Me.GroupBox4.Size = New System.Drawing.Size(303, 140)
        Me.GroupBox4.TabIndex = 7
        Me.GroupBox4.TabStop = False
        '
        'txtAddress
        '
        Me.txtAddress.Location = New System.Drawing.Point(24, 53)
        Me.txtAddress.Multiline = True
        Me.txtAddress.Name = "txtAddress"
        Me.txtAddress.Size = New System.Drawing.Size(257, 65)
        Me.txtAddress.TabIndex = 1
        '
        'lblAddress
        '
        Me.lblAddress.Location = New System.Drawing.Point(20, 23)
        Me.lblAddress.Name = "lblAddress"
        Me.lblAddress.Size = New System.Drawing.Size(98, 27)
        Me.lblAddress.TabIndex = 0
        Me.lblAddress.Text = "Address :"
        Me.lblAddress.TextAlign = System.Drawing.ContentAlignment.MiddleLeft
        '
        'MakeOrders
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(8.0!, 16.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(672, 492)
        Me.Controls.Add(Me.GroupBox4)
        Me.Controls.Add(Me.radDelivery)
        Me.Controls.Add(Me.radPickUp)
        Me.Controls.Add(Me.lblTotalPrice)
        Me.Controls.Add(Me.lblPrice)
        Me.Controls.Add(Me.btnOrder)
        Me.Controls.Add(Me.GroupBox3)
        Me.Controls.Add(Me.GroupBox2)
        Me.Controls.Add(Me.GroupBox1)
        Me.Name = "MakeOrders"
        Me.Text = "MakeOrders"
        Me.GroupBox1.ResumeLayout(False)
        CType(Me.numLily, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.numOrchid, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.numRose, System.ComponentModel.ISupportInitialize).EndInit()
        Me.GroupBox2.ResumeLayout(False)
        Me.GroupBox3.ResumeLayout(False)
        Me.GroupBox3.PerformLayout()
        Me.GroupBox4.ResumeLayout(False)
        Me.GroupBox4.PerformLayout()
        Me.ResumeLayout(False)

    End Sub

    Friend WithEvents GroupBox1 As GroupBox
    Friend WithEvents numLily As NumericUpDown
    Friend WithEvents numOrchid As NumericUpDown
    Friend WithEvents numRose As NumericUpDown
    Friend WithEvents lblRose As Label
    Friend WithEvents lblOrchid As Label
    Friend WithEvents lblLily As Label
    Friend WithEvents GroupBox2 As GroupBox
    Friend WithEvents radCashOnPickUp As RadioButton
    Friend WithEvents radCashOnDelivery As RadioButton
    Friend WithEvents GroupBox3 As GroupBox
    Friend WithEvents btnOrder As Button
    Friend WithEvents lblPrice As Label
    Friend WithEvents lblTotalPrice As Label
    Friend WithEvents radPickUp As RadioButton
    Friend WithEvents radDelivery As RadioButton
    Friend WithEvents GroupBox4 As GroupBox
    Friend WithEvents lblTime As Label
    Friend WithEvents lblDate As Label
    Friend WithEvents DateTimePicker1 As DateTimePicker
    Friend WithEvents txtTime As TextBox
    Friend WithEvents txtAddress As TextBox
    Friend WithEvents lblAddress As Label
End Class
