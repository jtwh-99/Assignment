Imports System.IO
Imports System.Text


Public Class Form1
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        D1.Format = DateTimePickerFormat.Custom
        D1.CustomFormat = "dd/MM/yyyy"

        D2.Format = DateTimePickerFormat.Custom
        D2.CustomFormat = "dd/MM/yyyy"

    End Sub

    Private Sub btnSearch_Click(sender As Object, e As EventArgs) Handles btnSearch.Click

        Dim fname As String = "C:\Users\msi user\OneDrive\Desktop\Agile\testData.csv"
        Dim colsexpected As Integer = 6
        Dim thereader As New StreamReader(fname, Encoding.Default)
        Dim sline As String = ""

        'Dim date1 As DateTime = DateTime.Parse(D1.Text)
        'Dim date2 As DateTime = DateTime.Parse(D2.Text)



        Do
            sline = thereader.ReadLine
            If sline Is Nothing Then Exit Do
            Dim words() As String = sline.Split(",")
            DataGridView1.Rows.Add("")



            'If words.Length = colsexpected Then
            For ix As Integer = 0 To 5
                DataGridView1.Rows(DataGridView1.Rows.Count - 1).Cells(ix).Value = words(ix)
            Next
            'Else
            '    DataGridView1.Rows(DataGridView1.Rows.Count - 1).Cells(0).Value = "error"
            '    DataGridView1.Rows(DataGridView1.Rows.Count - 1).DefaultCellStyle.BackColor = Color.Pink
            'End If

            If Not IsNumeric(words(0)) Then DataGridView1.Rows(DataGridView1.Rows.Count - 1).Cells(0).Style.BackColor = Color.Yellow

        Loop
        thereader.Close()


    End Sub
End Class
