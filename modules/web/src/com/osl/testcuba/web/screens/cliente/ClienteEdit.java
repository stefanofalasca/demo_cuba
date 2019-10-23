package com.osl.testcuba.web.screens.cliente;

import com.haulmont.cuba.gui.screen.*;
import com.osl.testcuba.entity.Cliente;

@UiController("testcuba_Cliente.edit")
@UiDescriptor("cliente-edit.xml")
@EditedEntityContainer("clienteDc")
@LoadDataBeforeShow
public class ClienteEdit extends StandardEditor<Cliente> {
}