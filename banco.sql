CREATE OR REPLACE FUNCTION consultas_por_convenio(p_id_convenio INT)
RETURNS TABLE(
    paciente VARCHAR,
    medico VARCHAR,
    data TIMESTAMP,
    status VARCHAR
) AS $$
SELECT p.nome, m.nome, c.data_hora, c.status
FROM consulta c
JOIN paciente p ON p.id_paciente = c.id_paciente
JOIN medico m ON m.id_medico = c.id_medico
JOIN paciente_convenio pc ON pc.id_paciente = p.id_paciente
WHERE pc.id_convenio = p_id_convenio
AND c.status = 'REALIZADA';
$$ LANGUAGE sql;