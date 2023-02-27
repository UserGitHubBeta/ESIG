<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class FrmConnexionSQL
    Inherits System.Windows.Forms.Form

    'Form remplace la méthode Dispose pour nettoyer la liste des composants.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Requise par le Concepteur Windows Form
    Private components As System.ComponentModel.IContainer

    'REMARQUE : la procédure suivante est requise par le Concepteur Windows Form
    'Elle peut être modifiée à l'aide du Concepteur Windows Form.  
    'Ne la modifiez pas à l'aide de l'éditeur de code.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.btnRequêteFigée = New System.Windows.Forms.Button()
        Me.GroupBox1 = New System.Windows.Forms.GroupBox()
        Me.tbNomFourn1 = New System.Windows.Forms.TextBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.GroupBox2 = New System.Windows.Forms.GroupBox()
        Me.tbNomFournSaisi = New System.Windows.Forms.TextBox()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.btnRequêteAvecSaisie = New System.Windows.Forms.Button()
        Me.efNumFourn = New System.Windows.Forms.TextBox()
        Me.GroupBox3 = New System.Windows.Forms.GroupBox()
        Me.efFourNum = New System.Windows.Forms.TextBox()
        Me.tbNbArtFourn = New System.Windows.Forms.TextBox()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.btnRequêteJointure = New System.Windows.Forms.Button()
        Me.GroupBox1.SuspendLayout()
        Me.GroupBox2.SuspendLayout()
        Me.GroupBox3.SuspendLayout()
        Me.SuspendLayout()
        '
        'btnRequêteFigée
        '
        Me.btnRequêteFigée.Location = New System.Drawing.Point(28, 48)
        Me.btnRequêteFigée.Name = "btnRequêteFigée"
        Me.btnRequêteFigée.Size = New System.Drawing.Size(75, 23)
        Me.btnRequêteFigée.TabIndex = 0
        Me.btnRequêteFigée.Text = "Go"
        Me.btnRequêteFigée.UseVisualStyleBackColor = True
        '
        'GroupBox1
        '
        Me.GroupBox1.Controls.Add(Me.tbNomFourn1)
        Me.GroupBox1.Controls.Add(Me.Label1)
        Me.GroupBox1.Controls.Add(Me.btnRequêteFigée)
        Me.GroupBox1.Location = New System.Drawing.Point(56, 47)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Size = New System.Drawing.Size(641, 100)
        Me.GroupBox1.TabIndex = 1
        Me.GroupBox1.TabStop = False
        Me.GroupBox1.Text = "Démo interrogation ""en dur"""
        '
        'tbNomFourn1
        '
        Me.tbNomFourn1.Location = New System.Drawing.Point(333, 48)
        Me.tbNomFourn1.Name = "tbNomFourn1"
        Me.tbNomFourn1.Size = New System.Drawing.Size(213, 22)
        Me.tbNomFourn1.TabIndex = 2
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(144, 51)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(158, 17)
        Me.Label1.TabIndex = 1
        Me.Label1.Text = "Nom du fournisseur n°1"
        '
        'GroupBox2
        '
        Me.GroupBox2.Controls.Add(Me.efNumFourn)
        Me.GroupBox2.Controls.Add(Me.tbNomFournSaisi)
        Me.GroupBox2.Controls.Add(Me.Label2)
        Me.GroupBox2.Controls.Add(Me.btnRequêteAvecSaisie)
        Me.GroupBox2.Location = New System.Drawing.Point(56, 173)
        Me.GroupBox2.Name = "GroupBox2"
        Me.GroupBox2.Size = New System.Drawing.Size(641, 100)
        Me.GroupBox2.TabIndex = 3
        Me.GroupBox2.TabStop = False
        Me.GroupBox2.Text = "Démo interrogation dépendant d'une saisie"
        '
        'tbNomFournSaisi
        '
        Me.tbNomFournSaisi.Location = New System.Drawing.Point(370, 51)
        Me.tbNomFournSaisi.Name = "tbNomFournSaisi"
        Me.tbNomFournSaisi.Size = New System.Drawing.Size(213, 22)
        Me.tbNomFournSaisi.TabIndex = 2
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(122, 51)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(150, 17)
        Me.Label2.TabIndex = 1
        Me.Label2.Text = "Nom du fournisseur n°"
        '
        'btnRequêteAvecSaisie
        '
        Me.btnRequêteAvecSaisie.Location = New System.Drawing.Point(28, 48)
        Me.btnRequêteAvecSaisie.Name = "btnRequêteAvecSaisie"
        Me.btnRequêteAvecSaisie.Size = New System.Drawing.Size(75, 23)
        Me.btnRequêteAvecSaisie.TabIndex = 0
        Me.btnRequêteAvecSaisie.Text = "Go"
        Me.btnRequêteAvecSaisie.UseVisualStyleBackColor = True
        '
        'efNumFourn
        '
        Me.efNumFourn.Location = New System.Drawing.Point(278, 51)
        Me.efNumFourn.Name = "efNumFourn"
        Me.efNumFourn.Size = New System.Drawing.Size(43, 22)
        Me.efNumFourn.TabIndex = 3
        '
        'GroupBox3
        '
        Me.GroupBox3.Controls.Add(Me.efFourNum)
        Me.GroupBox3.Controls.Add(Me.tbNbArtFourn)
        Me.GroupBox3.Controls.Add(Me.Label3)
        Me.GroupBox3.Controls.Add(Me.btnRequêteJointure)
        Me.GroupBox3.Location = New System.Drawing.Point(56, 302)
        Me.GroupBox3.Name = "GroupBox3"
        Me.GroupBox3.Size = New System.Drawing.Size(641, 100)
        Me.GroupBox3.TabIndex = 4
        Me.GroupBox3.TabStop = False
        Me.GroupBox3.Text = "Démo interrogation dépendant d'une saisie avec jointure"
        '
        'efFourNum
        '
        Me.efFourNum.Location = New System.Drawing.Point(359, 51)
        Me.efFourNum.Name = "efFourNum"
        Me.efFourNum.Size = New System.Drawing.Size(43, 22)
        Me.efFourNum.TabIndex = 3
        '
        'tbNbArtFourn
        '
        Me.tbNbArtFourn.Location = New System.Drawing.Point(443, 51)
        Me.tbNbArtFourn.Name = "tbNbArtFourn"
        Me.tbNbArtFourn.Size = New System.Drawing.Size(140, 22)
        Me.tbNbArtFourn.TabIndex = 2
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(122, 51)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(231, 17)
        Me.Label3.TabIndex = 1
        Me.Label3.Text = "Nombre d'articles du fournisseur n°"
        '
        'btnRequêteJointure
        '
        Me.btnRequêteJointure.Location = New System.Drawing.Point(28, 48)
        Me.btnRequêteJointure.Name = "btnRequêteJointure"
        Me.btnRequêteJointure.Size = New System.Drawing.Size(75, 23)
        Me.btnRequêteJointure.TabIndex = 0
        Me.btnRequêteJointure.Text = "Go"
        Me.btnRequêteJointure.UseVisualStyleBackColor = True
        '
        'FrmConnexionSQL
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(8.0!, 16.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(800, 450)
        Me.Controls.Add(Me.GroupBox3)
        Me.Controls.Add(Me.GroupBox2)
        Me.Controls.Add(Me.GroupBox1)
        Me.Name = "FrmConnexionSQL"
        Me.Text = "Démonstration de connexion SQL"
        Me.GroupBox1.ResumeLayout(False)
        Me.GroupBox1.PerformLayout()
        Me.GroupBox2.ResumeLayout(False)
        Me.GroupBox2.PerformLayout()
        Me.GroupBox3.ResumeLayout(False)
        Me.GroupBox3.PerformLayout()
        Me.ResumeLayout(False)

    End Sub

    Friend WithEvents btnRequêteFigée As Button
    Friend WithEvents GroupBox1 As GroupBox
    Friend WithEvents tbNomFourn1 As TextBox
    Friend WithEvents Label1 As Label
    Friend WithEvents GroupBox2 As GroupBox
    Friend WithEvents efNumFourn As TextBox
    Friend WithEvents tbNomFournSaisi As TextBox
    Friend WithEvents Label2 As Label
    Friend WithEvents btnRequêteAvecSaisie As Button
    Friend WithEvents GroupBox3 As GroupBox
    Friend WithEvents efFourNum As TextBox
    Friend WithEvents tbNbArtFourn As TextBox
    Friend WithEvents Label3 As Label
    Friend WithEvents btnRequêteJointure As Button
End Class
