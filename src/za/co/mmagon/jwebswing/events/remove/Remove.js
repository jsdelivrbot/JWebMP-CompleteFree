JW_APP_NAME.directive('ngRemove', function ($parse) {
        return function (scope, element, attrs) {
            var fn = $parse(attrs.ngRemove);
            element.on('remove', function (event) {
                scope.$apply(function () {
                    event.preventDefault();
                    fn(scope, {$event: event});
                });
            });
        };
    }); 