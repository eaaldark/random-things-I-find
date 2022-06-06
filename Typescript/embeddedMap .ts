const citas = [
  {
    id: 401,
    expectedDuration: "0",
    description: "Medicina General",
    orderAttention: 0,
    address: "",
    chiefComplaint: "",
    tytocareId: "68",
    insuranceCarrier: "el planzaso",
    doctorUserEntityId: 464,
    patientUserEntityId: 42,
    nurseUserEntityId: 1,
    statusPriorityIdId: 2,
    statusAssistanceTypeIdId: 10,
    statusStatusIdId: 6,
    beginAt: "2022-06-02T21:00:00.000Z",
    endAt: "2022-06-02T21:15:00.000Z",
  },
  {
    id: 402,
    expectedDuration: "0",
    description: "medicina general",
    orderAttention: 0,
    address: "",
    chiefComplaint: "",
    tytocareId: "65",
    insuranceCarrier: "el hospital1",
    doctorUserEntityId: 464,
    patientUserEntityId: 496,
    nurseUserEntityId: 464,
    statusPriorityIdId: 1,
    statusAssistanceTypeIdId: 11,
    statusStatusIdId: 6,
    beginAt: "2022-06-02T20:30:00.000Z",
    endAt: "2022-06-02T20:45:00.000Z",
  },
  {
    id: 403,
    expectedDuration: "0",
    description: "medicina especialista",
    orderAttention: 23,
    address: "",
    chiefComplaint: "",
    tytocareId: "65",
    insuranceCarrier: "abuelos",
    doctorUserEntityId: 464,
    patientUserEntityId: 497,
    nurseUserEntityId: 3,
    statusPriorityIdId: 2,
    statusAssistanceTypeIdId: 10,
    statusStatusIdId: 6,
    beginAt: "2022-06-02T22:45:00.000Z",
    endAt: "2022-06-01T23:00:00.000Z",
  },
  {
    id: 404,
    expectedDuration: "0",
    description: "medicina exigente",
    orderAttention: 0,
    address: "",
    chiefComplaint: "",
    tytocareId: "56",
    insuranceCarrier: "seguro11",
    doctorUserEntityId: 464,
    patientUserEntityId: 498,
    nurseUserEntityId: 628,
    statusPriorityIdId: 2,
    statusAssistanceTypeIdId: 12,
    statusStatusIdId: 6,
    beginAt: "2022-06-02T15:15:00.000Z",
    endAt: "2022-06-02T15:30:00.000Z",
  },
  {
    id: 430,
    expectedDuration: "0",
    description: "Detallazo",
    orderAttention: 0,
    address: "",
    chiefComplaint: "",
    tytocareId: "w45h67urt",
    insuranceCarrier: "MMMM",
    doctorUserEntityId: 464,
    patientUserEntityId: 42,
    nurseUserEntityId: 464,
    statusPriorityIdId: 2,
    statusAssistanceTypeIdId: 12,
    statusStatusIdId: 6,
    beginAt: "2022-06-02T18:00:00.000Z",
    endAt: "2022-06-02T18:30:00.000Z",
  },
];

const pacientes = [
  {
    value: 42,
    label: "Juan Pati Corto ",
  },
  {
    value: 53,
    label: "Valeria Catalina Sepulveda Gomez ",
  },
  {
    value: 496,
    label: "Yair Yair Yair Yair ",
  },
  {
    value: 497,
    label: "Lorenzo Contreras Stesech Tamarindo ",
  },
  {
    value: 498,
    label: "Luis Tripalosky Stesech Tamarindo ",
  },
  {
    value: 529,
    label: "Rister Jumaniaz Hikulois Tromatias ",
  },
  {
    value: 566,
    label: "Andrea Catalina Gomez muñoz ",
  },
  {
    value: 567,
    label: "Daniela L Caraballo Calle ",
  },
  {
    value: 595,
    label: "Ana Catalina Mendoza Muñoz ",
  },
  {
    value: 596,
    label: "Paula Maria Gomez muñoz ",
  },
  {
    value: 661,
    label: "Armando Casitas Demaderas Locas ",
  },
  {
    value: 662,
    label: "Desarmando Casitas Demaderas Locas ",
  },
  {
    value: 663,
    label: "Ramiro Alfabelero ",
  },
  {
    value: 664,
    label: "Holmedos Ricachon ",
  },
  {
    value: 665,
    label: "Kamado Mimido Intemados Night ",
  },
  {
    value: 666,
    label: "Asdf Skakaks ",
  },
  {
    value: 694,
    label: "Kwkskwk Nwjwjwk ",
  },
  {
    value: 727,
    label: "Jeremias Julicas Kabraste Lomidas ",
  },
  {
    value: 728,
    label: "Maria Alejandra Rivera Acevedo ",
  },
  {
    value: 729,
    label: "jairo rodrigo rodriguez sanchez ",
  },
  {
    value: 730,
    label: "leidy marcela bonilla gutierrez ",
  },
  {
    value: 731,
    label: "juan  david galarga tercero ",
  },
  {
    value: 732,
    label: "Pacha  Pachita Rodríguez Ruiz ",
  },
  {
    value: 733,
    label: "jhonathan ocoro ",
  },
  {
    value: 760,
    label: "pepito perez parra piro ",
  },
  {
    value: 761,
    label: "bici llanta tenedor frenos ",
  },
  {
    value: 763,
    label: "mia natalia loca rodriguez ",
  },
  {
    value: 764,
    label: "Manchaz Aurelio bonilla cucharin ",
  },
  {
    value: 765,
    label: "zapatin zapaton zapato zapatilla ",
  },
  {
    value: 793,
    label: "jhonathan euxebio ocoro asasa ",
  },
  {
    value: 826,
    label: "Luisa Andrea Cubides Londoño ",
  },
  {
    value: 859,
    label: "Harold Garma Holidas Jokaro ",
  },
];

console.clear();

citas.map((appointment: any) => {
  pacientes.map((patient: any) => {
    if (appointment.patientUserEntityId === patient.value) {
      appointment.patientFullName = patient.label;
    }
  });

  console.log(appointment);
});
