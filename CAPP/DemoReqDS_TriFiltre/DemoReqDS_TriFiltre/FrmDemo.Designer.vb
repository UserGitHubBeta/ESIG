<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class FrmDemo
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
        Me.components = New System.ComponentModel.Container()
        Me.EmployeDataGridView = New System.Windows.Forms.DataGridView()
        Me.EmployeBindingSource = New System.Windows.Forms.BindingSource(Me.components)
        Me.EmployeDepartementDataSet = New DemoReqDS_TriFiltre.EmployeDepartementDataSet()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.tbSalMax = New System.Windows.Forms.TextBox()
        Me.EmployeTableAdapter = New DemoReqDS_TriFiltre.EmployeDepartementDataSetTableAdapters.EmployeTableAdapter()
        Me.TableAdapterManager = New DemoReqDS_TriFiltre.EmployeDepartementDataSetTableAdapters.TableAdapterManager()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.efFonction = New System.Windows.Forms.TextBox()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.tbSalMaxFonc = New System.Windows.Forms.TextBox()
        Me.DataGridViewTextBoxColumn1 = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.DataGridViewTextBoxColumn6 = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.DataGridViewTextBoxColumn7 = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.DataGridViewTextBoxColumn14 = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.DataGridViewTextBoxColumn13 = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.DataGridViewTextBoxColumn2 = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.DataGridViewTextBoxColumn3 = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.DataGridViewTextBoxColumn8 = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.DataGridViewTextBoxColumn9 = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.DataGridViewTextBoxColumn10 = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.DataGridViewTextBoxColumn11 = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.DataGridViewTextBoxColumn12 = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.GroupBox1 = New System.Windows.Forms.GroupBox()
        Me.GroupBox2 = New System.Windows.Forms.GroupBox()
        Me.btnTri = New System.Windows.Forms.Button()
        Me.chbDécroissant = New System.Windows.Forms.CheckBox()
        Me.btnFiltre = New System.Windows.Forms.Button()
        CType(Me.EmployeDataGridView, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.EmployeBindingSource, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.EmployeDepartementDataSet, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.GroupBox1.SuspendLayout()
        Me.GroupBox2.SuspendLayout()
        Me.SuspendLayout()
        '
        'EmployeDataGridView
        '
        Me.EmployeDataGridView.AutoGenerateColumns = False
        Me.EmployeDataGridView.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize
        Me.EmployeDataGridView.Columns.AddRange(New System.Windows.Forms.DataGridViewColumn() {Me.DataGridViewTextBoxColumn1, Me.DataGridViewTextBoxColumn6, Me.DataGridViewTextBoxColumn7, Me.DataGridViewTextBoxColumn14, Me.DataGridViewTextBoxColumn13, Me.DataGridViewTextBoxColumn2, Me.DataGridViewTextBoxColumn3, Me.DataGridViewTextBoxColumn8, Me.DataGridViewTextBoxColumn9, Me.DataGridViewTextBoxColumn10, Me.DataGridViewTextBoxColumn11, Me.DataGridViewTextBoxColumn12})
        Me.EmployeDataGridView.DataSource = Me.EmployeBindingSource
        Me.EmployeDataGridView.Location = New System.Drawing.Point(12, 12)
        Me.EmployeDataGridView.Name = "EmployeDataGridView"
        Me.EmployeDataGridView.RowHeadersWidth = 62
        Me.EmployeDataGridView.RowTemplate.Height = 28
        Me.EmployeDataGridView.Size = New System.Drawing.Size(1533, 260)
        Me.EmployeDataGridView.TabIndex = 1
        '
        'EmployeBindingSource
        '
        Me.EmployeBindingSource.DataMember = "Employe"
        Me.EmployeBindingSource.DataSource = Me.EmployeDepartementDataSet
        Me.EmployeBindingSource.Filter = ""
        Me.EmployeBindingSource.Sort = ""
        '
        'EmployeDepartementDataSet
        '
        Me.EmployeDepartementDataSet.DataSetName = "EmployeDepartementDataSet"
        Me.EmployeDepartementDataSet.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(18, 39)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(160, 20)
        Me.Label1.TabIndex = 2
        Me.Label1.Text = "Salaire le plus élevé : "
        '
        'tbSalMax
        '
        Me.tbSalMax.Location = New System.Drawing.Point(174, 33)
        Me.tbSalMax.Name = "tbSalMax"
        Me.tbSalMax.Size = New System.Drawing.Size(130, 26)
        Me.tbSalMax.TabIndex = 3
        '
        'EmployeTableAdapter
        '
        Me.EmployeTableAdapter.ClearBeforeFill = True
        '
        'TableAdapterManager
        '
        Me.TableAdapterManager.BackupDataSetBeforeUpdate = False
        Me.TableAdapterManager.DepartementTableAdapter = Nothing
        Me.TableAdapterManager.EmployeTableAdapter = Me.EmployeTableAdapter
        Me.TableAdapterManager.UpdateOrder = DemoReqDS_TriFiltre.EmployeDepartementDataSetTableAdapters.TableAdapterManager.UpdateOrderOption.InsertUpdateDelete
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(22, 87)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(145, 20)
        Me.Label2.TabIndex = 4
        Me.Label2.Text = "Pour la fonction de "
        '
        'efFonction
        '
        Me.efFonction.Location = New System.Drawing.Point(174, 87)
        Me.efFonction.Name = "efFonction"
        Me.efFonction.Size = New System.Drawing.Size(130, 26)
        Me.efFonction.TabIndex = 5
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(310, 87)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(195, 20)
        Me.Label3.TabIndex = 6
        Me.Label3.Text = "le salaire le plus élevé est  "
        '
        'tbSalMaxFonc
        '
        Me.tbSalMaxFonc.Location = New System.Drawing.Point(511, 84)
        Me.tbSalMaxFonc.Name = "tbSalMaxFonc"
        Me.tbSalMaxFonc.Size = New System.Drawing.Size(165, 26)
        Me.tbSalMaxFonc.TabIndex = 7
        '
        'DataGridViewTextBoxColumn1
        '
        Me.DataGridViewTextBoxColumn1.DataPropertyName = "empno"
        Me.DataGridViewTextBoxColumn1.HeaderText = "empno"
        Me.DataGridViewTextBoxColumn1.MinimumWidth = 8
        Me.DataGridViewTextBoxColumn1.Name = "DataGridViewTextBoxColumn1"
        Me.DataGridViewTextBoxColumn1.Width = 150
        '
        'DataGridViewTextBoxColumn6
        '
        Me.DataGridViewTextBoxColumn6.DataPropertyName = "empnom"
        Me.DataGridViewTextBoxColumn6.HeaderText = "empnom"
        Me.DataGridViewTextBoxColumn6.MinimumWidth = 8
        Me.DataGridViewTextBoxColumn6.Name = "DataGridViewTextBoxColumn6"
        Me.DataGridViewTextBoxColumn6.Width = 150
        '
        'DataGridViewTextBoxColumn7
        '
        Me.DataGridViewTextBoxColumn7.DataPropertyName = "emppren"
        Me.DataGridViewTextBoxColumn7.HeaderText = "emppren"
        Me.DataGridViewTextBoxColumn7.MinimumWidth = 8
        Me.DataGridViewTextBoxColumn7.Name = "DataGridViewTextBoxColumn7"
        Me.DataGridViewTextBoxColumn7.Width = 150
        '
        'DataGridViewTextBoxColumn14
        '
        Me.DataGridViewTextBoxColumn14.DataPropertyName = "empsal"
        Me.DataGridViewTextBoxColumn14.HeaderText = "empsal"
        Me.DataGridViewTextBoxColumn14.MinimumWidth = 8
        Me.DataGridViewTextBoxColumn14.Name = "DataGridViewTextBoxColumn14"
        Me.DataGridViewTextBoxColumn14.Width = 150
        '
        'DataGridViewTextBoxColumn13
        '
        Me.DataGridViewTextBoxColumn13.DataPropertyName = "empfonc"
        Me.DataGridViewTextBoxColumn13.HeaderText = "empfonc"
        Me.DataGridViewTextBoxColumn13.MinimumWidth = 8
        Me.DataGridViewTextBoxColumn13.Name = "DataGridViewTextBoxColumn13"
        Me.DataGridViewTextBoxColumn13.Width = 150
        '
        'DataGridViewTextBoxColumn2
        '
        Me.DataGridViewTextBoxColumn2.DataPropertyName = "empnochef"
        Me.DataGridViewTextBoxColumn2.HeaderText = "empnochef"
        Me.DataGridViewTextBoxColumn2.MinimumWidth = 8
        Me.DataGridViewTextBoxColumn2.Name = "DataGridViewTextBoxColumn2"
        Me.DataGridViewTextBoxColumn2.Width = 150
        '
        'DataGridViewTextBoxColumn3
        '
        Me.DataGridViewTextBoxColumn3.DataPropertyName = "empdepno"
        Me.DataGridViewTextBoxColumn3.HeaderText = "empdepno"
        Me.DataGridViewTextBoxColumn3.MinimumWidth = 8
        Me.DataGridViewTextBoxColumn3.Name = "DataGridViewTextBoxColumn3"
        Me.DataGridViewTextBoxColumn3.Width = 150
        '
        'DataGridViewTextBoxColumn8
        '
        Me.DataGridViewTextBoxColumn8.DataPropertyName = "empadr"
        Me.DataGridViewTextBoxColumn8.HeaderText = "empadr"
        Me.DataGridViewTextBoxColumn8.MinimumWidth = 8
        Me.DataGridViewTextBoxColumn8.Name = "DataGridViewTextBoxColumn8"
        Me.DataGridViewTextBoxColumn8.Width = 150
        '
        'DataGridViewTextBoxColumn9
        '
        Me.DataGridViewTextBoxColumn9.DataPropertyName = "empnpa"
        Me.DataGridViewTextBoxColumn9.HeaderText = "empnpa"
        Me.DataGridViewTextBoxColumn9.MinimumWidth = 8
        Me.DataGridViewTextBoxColumn9.Name = "DataGridViewTextBoxColumn9"
        Me.DataGridViewTextBoxColumn9.Width = 150
        '
        'DataGridViewTextBoxColumn10
        '
        Me.DataGridViewTextBoxColumn10.DataPropertyName = "emploc"
        Me.DataGridViewTextBoxColumn10.HeaderText = "emploc"
        Me.DataGridViewTextBoxColumn10.MinimumWidth = 8
        Me.DataGridViewTextBoxColumn10.Name = "DataGridViewTextBoxColumn10"
        Me.DataGridViewTextBoxColumn10.Width = 150
        '
        'DataGridViewTextBoxColumn11
        '
        Me.DataGridViewTextBoxColumn11.DataPropertyName = "empntel"
        Me.DataGridViewTextBoxColumn11.HeaderText = "empntel"
        Me.DataGridViewTextBoxColumn11.MinimumWidth = 8
        Me.DataGridViewTextBoxColumn11.Name = "DataGridViewTextBoxColumn11"
        Me.DataGridViewTextBoxColumn11.Width = 150
        '
        'DataGridViewTextBoxColumn12
        '
        Me.DataGridViewTextBoxColumn12.DataPropertyName = "empdnais"
        Me.DataGridViewTextBoxColumn12.HeaderText = "empdnais"
        Me.DataGridViewTextBoxColumn12.MinimumWidth = 8
        Me.DataGridViewTextBoxColumn12.Name = "DataGridViewTextBoxColumn12"
        Me.DataGridViewTextBoxColumn12.Width = 150
        '
        'GroupBox1
        '
        Me.GroupBox1.Controls.Add(Me.tbSalMaxFonc)
        Me.GroupBox1.Controls.Add(Me.Label3)
        Me.GroupBox1.Controls.Add(Me.efFonction)
        Me.GroupBox1.Controls.Add(Me.Label2)
        Me.GroupBox1.Controls.Add(Me.tbSalMax)
        Me.GroupBox1.Controls.Add(Me.Label1)
        Me.GroupBox1.Location = New System.Drawing.Point(26, 341)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Size = New System.Drawing.Size(697, 174)
        Me.GroupBox1.TabIndex = 8
        Me.GroupBox1.TabStop = False
        Me.GroupBox1.Text = "Démo requêtes dans le DataSet"
        '
        'GroupBox2
        '
        Me.GroupBox2.Controls.Add(Me.btnFiltre)
        Me.GroupBox2.Controls.Add(Me.chbDécroissant)
        Me.GroupBox2.Controls.Add(Me.btnTri)
        Me.GroupBox2.Location = New System.Drawing.Point(781, 320)
        Me.GroupBox2.Name = "GroupBox2"
        Me.GroupBox2.Size = New System.Drawing.Size(750, 221)
        Me.GroupBox2.TabIndex = 9
        Me.GroupBox2.TabStop = False
        Me.GroupBox2.Text = "Démo tri et filtrage"
        '
        'btnTri
        '
        Me.btnTri.Location = New System.Drawing.Point(66, 94)
        Me.btnTri.Name = "btnTri"
        Me.btnTri.Size = New System.Drawing.Size(89, 82)
        Me.btnTri.TabIndex = 0
        Me.btnTri.Text = "Trier par nom"
        Me.btnTri.UseVisualStyleBackColor = True
        '
        'chbDécroissant
        '
        Me.chbDécroissant.AutoSize = True
        Me.chbDécroissant.Location = New System.Drawing.Point(66, 54)
        Me.chbDécroissant.Name = "chbDécroissant"
        Me.chbDécroissant.Size = New System.Drawing.Size(161, 24)
        Me.chbDécroissant.TabIndex = 1
        Me.chbDécroissant.Text = "Ordre décroissant"
        Me.chbDécroissant.UseVisualStyleBackColor = True
        '
        'btnFiltre
        '
        Me.btnFiltre.Location = New System.Drawing.Point(367, 94)
        Me.btnFiltre.Name = "btnFiltre"
        Me.btnFiltre.Size = New System.Drawing.Size(94, 82)
        Me.btnFiltre.TabIndex = 2
        Me.btnFiltre.Text = "Filtrer sur la fonction"
        Me.btnFiltre.UseVisualStyleBackColor = True
        '
        'FrmDemo
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(9.0!, 20.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(1621, 569)
        Me.Controls.Add(Me.GroupBox2)
        Me.Controls.Add(Me.GroupBox1)
        Me.Controls.Add(Me.EmployeDataGridView)
        Me.Name = "FrmDemo"
        Me.Text = "Démo Requête dans le DataSet + Tri et Filtrage"
        CType(Me.EmployeDataGridView, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.EmployeBindingSource, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.EmployeDepartementDataSet, System.ComponentModel.ISupportInitialize).EndInit()
        Me.GroupBox1.ResumeLayout(False)
        Me.GroupBox1.PerformLayout()
        Me.GroupBox2.ResumeLayout(False)
        Me.GroupBox2.PerformLayout()
        Me.ResumeLayout(False)

    End Sub

    Friend WithEvents EmployeDepartementDataSet As EmployeDepartementDataSet
    Friend WithEvents EmployeBindingSource As BindingSource
    Friend WithEvents EmployeTableAdapter As EmployeDepartementDataSetTableAdapters.EmployeTableAdapter
    Friend WithEvents TableAdapterManager As EmployeDepartementDataSetTableAdapters.TableAdapterManager
    Friend WithEvents EmployeDataGridView As DataGridView
    Friend WithEvents Label1 As Label
    Friend WithEvents tbSalMax As TextBox
    Friend WithEvents Label2 As Label
    Friend WithEvents efFonction As TextBox
    Friend WithEvents Label3 As Label
    Friend WithEvents tbSalMaxFonc As TextBox
    Friend WithEvents DataGridViewTextBoxColumn1 As DataGridViewTextBoxColumn
    Friend WithEvents DataGridViewTextBoxColumn6 As DataGridViewTextBoxColumn
    Friend WithEvents DataGridViewTextBoxColumn7 As DataGridViewTextBoxColumn
    Friend WithEvents DataGridViewTextBoxColumn14 As DataGridViewTextBoxColumn
    Friend WithEvents DataGridViewTextBoxColumn13 As DataGridViewTextBoxColumn
    Friend WithEvents DataGridViewTextBoxColumn2 As DataGridViewTextBoxColumn
    Friend WithEvents DataGridViewTextBoxColumn3 As DataGridViewTextBoxColumn
    Friend WithEvents DataGridViewTextBoxColumn8 As DataGridViewTextBoxColumn
    Friend WithEvents DataGridViewTextBoxColumn9 As DataGridViewTextBoxColumn
    Friend WithEvents DataGridViewTextBoxColumn10 As DataGridViewTextBoxColumn
    Friend WithEvents DataGridViewTextBoxColumn11 As DataGridViewTextBoxColumn
    Friend WithEvents DataGridViewTextBoxColumn12 As DataGridViewTextBoxColumn
    Friend WithEvents GroupBox1 As GroupBox
    Friend WithEvents GroupBox2 As GroupBox
    Friend WithEvents chbDécroissant As CheckBox
    Friend WithEvents btnTri As Button
    Friend WithEvents btnFiltre As Button
End Class
