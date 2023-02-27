Imports System.Data.SqlClient

Public Class FrmConnexionSQL

    Private maConnexion As New SqlConnection(My.Settings.Article_FournisseurConnectionString)  ' pour accéder à la chaîne de connexion de la DataSource)  ' pour accéder à la chaîne de connexion de la DataSource

    Private Sub btnRequêteFigée_Click(sender As Object, e As EventArgs) Handles btnRequêteFigée.Click
        Dim cmd As New SqlCommand

        'le texte de la requête
        cmd.CommandText = "Select FouNom FROM Fournisseur WHERE FouNo = 1"

        'pour **accéder** à la base de données il est indispensable d'utiliser une connexion
        ' ici on utilise la connexion qui a été créée explicitement à l'instanciation du formulaire
        cmd.Connection = maConnexion

        'Les 3 instructions ci-dessus peuvent être condensées en une seule
        'Dim cmd As New SqlCommand("Select FouNom FROM Fournisseur WHERE FouNo = 1", maConnexion)

        'afin d'exécuter la commande, il faut ouvrir la connexion
        ' soit en utilisant la connexion créée comme ceci
        'maConnexion.Open()
        ' ou via la commande comme ceci :
        cmd.Connection.Open()
        Try
            tbNomFourn1.Text = cmd.ExecuteScalar()
        Catch ex As Exception
            MsgBox(ex.Message) ' il est indispensable d'être au courant qu'il y a eu un problème
        End Try
        cmd.Connection.Close()
    End Sub

    Private Sub btnRequêteAvecSaisie_Click(sender As Object, e As EventArgs) Handles btnRequêteAvecSaisie.Click
        Dim cmd As New SqlCommand

        'le texte de la requête
        cmd.CommandText = "Select FouNom FROM Fournisseur WHERE FouNo = " & efNumFourn.Text

        'pour **accéder** à la base de données il est indispensable d'utiliser une connexion
        ' ici on utilise la connexion qui a été créée explicitement à l'instanciation du formulaire
        cmd.Connection = maConnexion

        'Les 3 instructions ci-dessus peuvent être condensées en une seule
        'Dim cmd As New SqlCommand("Select FouNom FROM Fournisseur WHERE FouNo = 1", maConnexion)



        If efNumFourn.Text = "" Or IsNumeric(efNumFourn.Text) = False Then
            MessageBox.Show("Pas de numéro ou mauvais numéro")
        Else
            MessageBox.Show("Le texte de la requête est :" & vbCrLf & cmd.CommandText)

            'afin d'exécuter la commande, il faut ouvrir la connexion
            ' soit en utilisant la connexion créée comme ceci
            'maConnexion.Open()
            ' ou via la commande comme ceci :
            cmd.Connection.Open()
            Try
                Dim résultat As Object = cmd.ExecuteScalar()
                If résultat Is Nothing Then
                    tbNomFournSaisi.Text = "Fournisseur inconnu !"
                Else
                    tbNomFournSaisi.Text = résultat
                End If
            Catch ex As Exception
                MsgBox(ex.Message) ' il est indispensable d'être au courant qu'il y a eu un problème
            End Try
            cmd.Connection.Close()
        End If
    End Sub

    Private Sub btnRequêteJointure_Click(sender As Object, e As EventArgs) Handles btnRequêteJointure.Click

        Dim cmd As New SqlCommand

        'le texte de la requête
        cmd.CommandText = "Select COUNT(ArtNo) FROM Article WHERE ArtFouNo = " & efFourNum.Text

        'pour **accéder** à la base de données il est indispensable d'utiliser une connexion
        ' ici on utilise la connexion qui a été créée explicitement à l'instanciation du formulaire
        cmd.Connection = maConnexion

        'Les 3 instructions ci-dessus peuvent être condensées en une seule
        'Dim cmd As New SqlCommand("Select FouNom FROM Fournisseur WHERE FouNo = 1", maConnexion)

        If efFourNum.Text = "" Or IsNumeric(efFourNum.Text) = False Then
            MessageBox.Show("Pas de numéro ou mauvais numéro")
        Else
            MessageBox.Show("Le texte de la requête est :" & vbCrLf & cmd.CommandText)

            'afin d'exécuter la commande, il faut ouvrir la connexion
            ' soit en utilisant la connexion créée comme ceci
            'maConnexion.Open()
            ' ou via la commande comme ceci :
            cmd.Connection.Open()
            Try
                Dim résultat As Object = cmd.ExecuteScalar()
                tbNbArtFourn.Text = résultat
            Catch ex As Exception
                MsgBox(ex.Message) ' il est indispensable d'être au courant qu'il y a eu un problème
            End Try
            cmd.Connection.Close()
        End If

    End Sub
End Class
