Public Class FrmDemo

    'A FAIRE 
    ' - vérifier que efFonction n'est pas vide
    ' - gérer (ailleurs) le clic sur la DataGridView et utiliser la fonction de l'employé cliqué pour afficher 
    '   sa fonction (dans efFonction) et le salaire max de cette fonction.
    ' - filtrer sur une intervalle de salaire (entre deux bornes)

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        'TODO: cette ligne de code charge les données dans la table 'EmployeDepartementDataSet.Employe'. Vous pouvez la déplacer ou la supprimer selon les besoins.
        Me.EmployeTableAdapter.Fill(Me.EmployeDepartementDataSet.Employe)
        tbSalMax.Text = Format(EmployeTableAdapter.rqtSalMax, "#,##0.00 CHF")
        tbSalMaxFonc.Text = Format(EmployeTableAdapter.rqtSalMaxFonc(efFonction.Text), "#,##0.00 CHF")

    End Sub

    Private Sub efFonction_Leave(sender As Object, e As EventArgs) Handles efFonction.Leave
        tbSalMaxFonc.Text = Format(EmployeTableAdapter.rqtSalMaxFonc(efFonction.Text), "#,##0.00 CHF")
    End Sub

    Private Sub btnTri_Click(sender As Object, e As EventArgs) Handles btnTri.Click
        If btnTri.Text = "Trier par nom" Then
            EmployeBindingSource.Sort = "empnom, emppren"
            If chbDécroissant.Checked Then
                EmployeBindingSource.Sort = EmployeBindingSource.Sort + " DESC"
            End If
            btnTri.Text = "RAZ"
        Else ' Text = "RAZ"
            chbDécroissant.Checked = False
            EmployeBindingSource.Sort = ""
            btnTri.Text = "Trier par nom"
        End If
    End Sub

    Private Sub btnFiltre_Click(sender As Object, e As EventArgs) Handles btnFiltre.Click
        If btnFiltre.Text = "RAZ" Then
            EmployeBindingSource.Filter = ""
            btnFiltre.Text = "Filtrer sur la fonction"
        Else
            btnFiltre.Text = "RAZ"
            MessageBox.Show("empfonc = '" & efFonction.Text + "'", "Envoyé à Filter")
            EmployeBindingSource.Filter = "empfonc = '" & efFonction.Text + "'"
        End If
    End Sub
End Class
