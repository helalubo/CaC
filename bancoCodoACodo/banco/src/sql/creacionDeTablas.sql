
create databases codoacodobanco;

create table `codoacodobanco`.`clientes` (
`id` int( 11 ) unsigned not null auto_increment comment 'clave primaria',
`nombre` varchar( 100 ) not null comment 'nombre',
`cantidad` float not null comment 'un campo float',
primary key ( `id` ) ,
index ( `id` ) ,
unique ( `id` )
) engine = myisam character set utf8 collate utf8_general_ci comment =
'comentarios de tabla';


create table `codoacodobanco`.`bancos` (
`codigo` int( 11 ) unsigned not null auto_increment comment 'clave primaria',
`nombre` varchar( 100 ) not null comment 'nombre',
`fondo` float not null comment 'un campo float',
primary key ( `codigo` ) ,
index ( `codigo` ) ,
unique ( `codigo` )
) engine = myisam character set utf8 collate utf8_general_ci comment =
'comentarios de tabla';


insert into bancos (`codigo`,`nombre`,`fondo`) values  (1,'helalubo',5000000);